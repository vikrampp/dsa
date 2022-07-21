package com.eduvik.linkedlist;

import com.eduvik.ds.pojo.ListNode;

/**
 * Difficulty: Medium
 * 
 * @author Vikram P.
 *
 */
public class Leet92_ReverseLinkedList2 {
  public ListNode reverseBetween(ListNode head, int left, int right) {
    ListNode dummy = new ListNode(-1, head);
    ListNode curr = dummy.next;
    ListNode prev = dummy;
    int i = 1;
    while (i < left) {
      prev = curr;
      curr = curr.next;
      i++;
    }
    
    ListNode first = curr;
    ListNode newPrev = curr;
    ListNode newCurr = curr.next;
    while (i < right) {
      ListNode temp = newCurr.next;
      newCurr.next = newPrev;
      newPrev = newCurr;
      newCurr = temp;
      i++;
    }
    first.next = newCurr;
    prev.next = newPrev;
    return dummy.next;
  }
}
