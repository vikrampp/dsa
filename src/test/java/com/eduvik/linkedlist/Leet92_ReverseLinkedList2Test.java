package com.eduvik.linkedlist;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import com.eduvik.ds.pojo.ListNode;

/**
 * Test cases for Leetcode 92 Reverse Linked List II
 * 
 * @author Vikram P.
 *
 */
public class Leet92_ReverseLinkedList2Test {

  private Leet92_ReverseLinkedList2 object;

  @Before
  public void init() {
    object = new Leet92_ReverseLinkedList2();
  }

  @Test
  public void reverseBetween_1() {
    ListNode head = getLinkedList();
    ListNode ansHead = getReversedLinkedList1();
    ListNode rHead = object.reverseBetween(head, 2, 4);
    while (rHead != null) {
      assertEquals(rHead.val, ansHead.val);
      rHead = rHead.next;
      ansHead = ansHead.next;
    }
  }

  @Test
  public void reverseBetween_2() {
    ListNode head = getLinkedList();
    ListNode ansHead = getReversedLinkedList2();
    ListNode rHead = object.reverseBetween(head, 1, 5);
    while (rHead != null) {
      assertEquals(rHead.val, ansHead.val);
      rHead = rHead.next;
      ansHead = ansHead.next;
    }
  }
  
  @Test
  public void reverseBetween_3() {
    ListNode head = getLinkedList();
    ListNode ansHead = head;
    ListNode rHead = object.reverseBetween(head, 3, 3);
    while (rHead != null) {
      assertEquals(rHead.val, ansHead.val);
      rHead = rHead.next;
      ansHead = ansHead.next;
    }
  }
  
  private ListNode getLinkedList() {
    ListNode head = new ListNode(5);
    head = new ListNode(4, head);
    head = new ListNode(3, head);
    head = new ListNode(2, head);
    head = new ListNode(1, head);
    return head;
  }

  private ListNode getReversedLinkedList1() {
    ListNode head = new ListNode(5);
    head = new ListNode(2, head);
    head = new ListNode(3, head);
    head = new ListNode(4, head);
    head = new ListNode(1, head);
    return head;
  }
  
  private ListNode getReversedLinkedList2() {
    ListNode head = new ListNode(1);
    head = new ListNode(2, head);
    head = new ListNode(3, head);
    head = new ListNode(4, head);
    head = new ListNode(5, head);
    return head;
  }
}
