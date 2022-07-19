package com.eduvik.array;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for Leetcode 118 Pascal's Triangle problem
 * 
 * @author Vikram P.
 *
 */
public class Leet118_PascalTriangleTest {
  private Leet118_PascalTriangle object;

  @Before
  public void init() {
    object = new Leet118_PascalTriangle();
  }

  @Test
  public void test_generate_pascal_triangle1() {
    List<List<Integer>> answer = new ArrayList<>();
    List<Integer> row1 = new ArrayList<>();
    row1.add(1);

    List<Integer> row2 = new ArrayList<>();
    row2.add(1);
    row2.add(1);

    List<Integer> row3 = new ArrayList<>();
    row3.add(1);
    row3.add(2);
    row3.add(1);

    List<Integer> row4 = new ArrayList<>();
    row4.add(1);
    row4.add(3);
    row4.add(3);
    row4.add(1);

    List<Integer> row5 = new ArrayList<>();
    row5.add(1);
    row5.add(4);
    row5.add(6);
    row5.add(4);
    row5.add(1);

    answer.add(row1);
    answer.add(row2);
    answer.add(row3);
    answer.add(row4);
    answer.add(row5);

    int numRows = 5;
    List<List<Integer>> result = object.generate(numRows);
    assertEquals(answer, result);
    assertEquals(answer.get(0), result.get(0));
    assertEquals(answer.get(1), result.get(1));
    assertEquals(answer.get(2), result.get(2));
    assertEquals(answer.get(3), result.get(3));
    assertEquals(answer.get(4), result.get(4));
  }

  @Test
  public void test_generate_pascal_triangle2() {
    List<List<Integer>> answer = new ArrayList<>();
    List<Integer> row1 = new ArrayList<>();
    row1.add(1);
    answer.add(row1);

    int numRows = 1;
    List<List<Integer>> result = object.generate(numRows);
    assertEquals(answer, result);
    assertEquals(answer.get(0), result.get(0));
  }
}
