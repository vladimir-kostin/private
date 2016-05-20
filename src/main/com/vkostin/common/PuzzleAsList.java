package com.vkostin.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * stores cell in List<List<Cell>>
 */
public class PuzzleAsList implements Puzzle {

  private List<List<Cell>> cells = new ArrayList<>();

  public PuzzleAsList(Cell[][] cells) {
    for (Cell[] row : cells) {
      this.cells.add(Arrays.asList(row));
    }
  }

  @Override
  public int getRowCount() { return cells.size(); }
  @Override
  public int getRowLength() { return cells.get(0).size(); }
  @Override
  public Cell getCellAt(int rowIndex, int columnIndex) { return cells.get(rowIndex).get(columnIndex); }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof PuzzleAsList) { return Objects.equals(cells, ((PuzzleAsList)(o)).cells); }
    if (o instanceof Puzzle) { return isEqualToPuzzle((Puzzle) o); }
    return false;
  }

  @Override
  public int hashCode() { return Objects.hash(cells); }

}