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
  public String toString() {
    Node curr = head;
    String toString = "";
    while (curr != null) {
      toString += "{ " + curr.value + " }";
    }
    toString += null;
    return toString;
  }

  public void Append(int value){
    Node newNode = new Node();
    newNode.value = value;
    Node curr;

    if (head == null){
      head = newNode;
    } else {
      curr = head;
      while (curr.next != null) {
        curr.next = newNode;
      }
    }
  }

  public void insertBefore(int value, int newNodeValue){
    Node curr = head;
    Node prev = null;

    if(head != null){
      while(curr != null){
        if(curr.value == value){
          Node before = new Node(newNodeValue);
          before.next = curr;

          if(prev != null){
            prev.next = before;
          }else {
            head = before;
          }
          return;
        }
      }
    }
  }



  public void insertAfter(int value, int newValue){
    Node newNode = new Node(value);
    Node curr = head;
    while (curr != null){
      if(curr.value == value){
        newNode.next = curr.next;
        curr.next = newNode;
      }
      curr = curr.next;
    }
  }
}



