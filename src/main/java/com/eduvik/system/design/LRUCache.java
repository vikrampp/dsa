package com.eduvik.system.design;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
  private Map<Integer, Node> map;
  private Node head;
  private Node tail;
  private int capacity;

  LRUCache(int capacity) {
    this.capacity = capacity;
    map = new HashMap<>();
    head = new Node();
    tail = new Node();

    head.next = tail;
    tail.prev = head;
  }

  private void insert(Node node) {
    map.put(node.key, node);
    Node next = head.next;
    head.next = node;
    next.prev = node;
    node.next = next;
    node.prev = head;
  }

  private void remove(Node node) {
    map.remove(node.key);
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }

  public int get(int key) {
    if (!map.containsKey(key)) {
      return -1;
    }
    Node node = map.get(key);
    remove(node);
    insert(node);
    return node.val;
  }

  public void put(int key, int val) {
    if (map.containsKey(key)) {
      remove(map.get(key));
    }
    if (map.size() == capacity) {
      remove(tail.prev);
    }
    Node node = new Node(key, val);
    insert(node);
  }

  private class Node {
    int key;
    int val;
    Node next;
    Node prev;

    Node() {}

    Node(int key, int val) {
      this.key = key;
      this.val = val;
    }
  }
}
