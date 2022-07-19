package com.eduvik.monotonic.stack;

import java.util.Stack;

/**
 * Difficulty: Medium
 * 
 * @author Vikram P.
 *
 */
public class Leet402_RemoveKDigits {

  public String removeKdigits(String num, int k) {
    if (k > num.length()) return "0";
    if (num.length() == 0) return "0";
    
    Stack<Character> stack = new Stack<>();
    for (char c : num.toCharArray()) {
      while (k > 0 && !stack.isEmpty() && c < stack.peek()) {
        k--;
        stack.pop();
      }
      stack.push(c);
    }
    while (k > 0 && !stack.isEmpty()) {
      stack.pop();
      k--;
    }
    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.insert(0, stack.pop());
    }
    return sb.length() == 0 ? "0" : String.valueOf(Integer.parseInt(sb.toString()));
  }
}
