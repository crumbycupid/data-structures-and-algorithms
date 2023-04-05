package datastructures.linkedlist;

import datastructures.linkedlist.Node;

import java.security.SecureRandom;

public class LinkedList
{
  Node head = null;
  public void insert(int value)
  {
    Node newNode = new Node(value);
    if (head != null) {
      newNode.next = this.head;
    }
    head = newNode;
  }
  public boolean includes(int value)
  { Node curr = head;
    while (curr !=null) {
      if (curr.value == value) {
        return true;
      } else {
        curr = curr.next;
      }
    }
    return false;
  }

  @Override
  public String toString()
  {
    Node curr = head;
    String toString = "";
    while (curr != null){
      toString += "{ " + curr.value + " }";
    }
    toString += null;
    return toString;
  }
}

