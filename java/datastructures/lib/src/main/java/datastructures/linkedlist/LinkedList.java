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

    public void insertBefore(int value int newNodeValue){
      Node newNodeA = new Node();
      Node currA = head;
      newNode.value = newNodeValue;

      if(head.value == value){
        newNodeA.next = head;
        head = newNodeA;
      } while(currA.next != null && currA.next.value !=value){
        curr = currA.next;
      } if(currA.next != null){
        Node insert = currA.next;
        currA.next = newNodeA;
        newNodeA.next = insert;
        return;
      }
    }
    public void kValue(int k){
      Node currB = head;
      int listLength = 0;

      while (currB != null){
        listLength += 1;
        currB = currB.next;
      }
    }

    public void insertAfter(int valueA, int valueB){
      Node newNode =
    }


    @Override
    public String toString()
    {
      return "hello";  // TODO: implement me
    }
}



