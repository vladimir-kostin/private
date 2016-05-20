package com.vkostin.puzzle.kakuro;

import com.vkostin.common.PuzzleAsArray;
import com.vkostin.common.Solver;
import com.vkostin.common.TestUtils;
import org.junit.Test;

public class SimpleSolverTest {

  private Parser parser = new Parser(PuzzleAsArray::new);
  private Solver solver = new SimpleSolver();

  @Test
  public void shouldSolveQuicklySolvablePuzzles() {
    TestUtils.assertSolving(TestData.QUICKLY_SOLVABLE_TEST_DATA, parser, solver);
  }

}