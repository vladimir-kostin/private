package com.vkostin.tennerGrid;

import com.vkostin.Puzzle;
import com.vkostin.Solver;
import com.vkostin.ValueCell;
import com.vkostin.ValueCellWithCoordinates;

import java.util.Optional;

public class BetterSolver implements Solver {
  @Override
  public Puzzle solve(Puzzle puzzle) {
    return null;
  }

  static class SolverInstance extends AbstractSolverInstance {
    public SolverInstance(Puzzle puzzle) { super(puzzle); }

    @Override
    public Puzzle solve() {
//      if(isCurrentAssumptionWrong()) return null;

      ValueCellWithCoordinates unsolvedValueCell = findUnsolvedValueCellOrNull();
      if(null == unsolvedValueCell) return _puzzle;

      for (int valueToTry = Rules.MIN_ALLOWED_VALUE; valueToTry <= Rules.MAX_ALLOWED_VALUE; valueToTry++) {
        unsolvedValueCell.cell().setValue(valueToTry);

        if (doesColumnContainErrors(unsolvedValueCell.columnIndex())) continue;
        if (!areAllProperValueUniqueInRow(unsolvedValueCell.rowIndex())) continue;
        if (!valuesInContiguousCellsAreDifferent(unsolvedValueCell)) continue;

        Puzzle result = solve();
        if (null != result) return result;
      }

      Rules.clearValue(unsolvedValueCell.cell());
      return null;
    }

    private boolean valuesInContiguousCellsAreDifferent(ValueCellWithCoordinates valueCell) {
      if (!threeConsecutiveValueCellsInRowDoNotHaveValuesEqualTo(
              valueCell.cell().getValue(), valueCell.rowIndex()-1, valueCell.columnIndex()-1)) {
        return false;
      }

      if (!threeConsecutiveValueCellsInRowDoNotHaveValuesEqualTo(
              valueCell.cell().getValue(), valueCell.rowIndex()+1, valueCell.columnIndex()-1)) {
        return false;
      }

      return true;
    }

    private ValueCellWithCoordinates findUnsolvedValueCellOrNull() {
      for (int rowIndex = 0; rowIndex < _puzzle.getRowCount(); rowIndex++) {
        for (int columnIndex = 0; columnIndex < _puzzle.getRowLength(); columnIndex++) {
          Optional<ValueCell> unsolvedValueCell = valueCell(rowIndex, columnIndex)
                  .filter(Rules::hasUnsolvedValue);
          if (unsolvedValueCell.isPresent()) {
            return new ValueCellWithCoordinates(unsolvedValueCell.get(), rowIndex, columnIndex);
          }
        }
      }
      return null;
    }

  }

}
