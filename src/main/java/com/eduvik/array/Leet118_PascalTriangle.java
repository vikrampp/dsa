package com.eduvik.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Difficulty: Easy
 * 
 * @author Vikram P.
 *
 */
public class Leet118_PascalTriangle {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> row = new ArrayList<>();
    row.add(1);
    result.add(row);

    int rowNum = 1;
    while (rowNum < numRows) {
      List<Integer> prevRow = result.get(rowNum - 1);
      List<Integer> newRow = new ArrayList<>();
      newRow.add(1);
      for (int i = 0; i < prevRow.size() - 1; i++) {
        newRow.add(prevRow.get(i) + prevRow.get(i + 1));
      }
      newRow.add(1);
      result.add(newRow);
      rowNum++;
    }
    return result;
  }
}
