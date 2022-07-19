package com.eduvik.monotonic.stack;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 * Test cases for Leetcode 402 Remove K Digits problem
 * 
 * @author Vikram P.
 *
 */
public class Leet402_RemoveKDigitsTest {

  private Leet402_RemoveKDigits object;

  @Before
  public void init() {
    object = new Leet402_RemoveKDigits();
  }

  @Test
  public void test_removeKdigits1() {
    String str = "1432219";
    int k = 3;
    String result = object.removeKdigits(str, k);
    assertEquals(result, "1219");
  }

  @Test
  public void test_removeKdigits2() {
    String str = "10200";
    int k = 1;
    String result = object.removeKdigits(str, k);
    assertEquals(result, "200");
  }

  @Test
  public void test_removeKdigits3() {
    String str = "10";
    int k = 2;
    String result = object.removeKdigits(str, k);
    assertEquals(result, "0");
  }

  @Test
  public void test_removeKdigits4() {
    String str = "123456";
    int k = 3;
    String result = object.removeKdigits(str, k);
    assertEquals(result, "123");
  }

  @Test
  public void test_removeKdigits5() {
    String str = "654321";
    int k = 3;
    String result = object.removeKdigits(str, k);
    assertEquals(result, "321");
  }
}
