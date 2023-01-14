package datastructures.linkedlist;

import datastructures.linkedlist.Node;

public class LinkedList
{
  Node head = null;
  public void insert(int value)
  {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else
      {
        newNode.next = this.head;
        head = newNode;
    }
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
    return "hello";  // TODO: implement me
  }
}

