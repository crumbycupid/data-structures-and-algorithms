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

  public void Append(int value){
    Node newNode = new Node();
    newNode.value = value;
    Node curr = head;

    if (head = null){
      head = newNode;
    }else{
      curr = head;
      while (curr.next !=null) {
        curr.next = newNode;
      }
  }

    public void insertBefore(int value int newNodeValue){
      Node newNode = new Node();
      Node curr = head;
      newNode.value = newNodeValue;

      if(head.value == value){
        newNode.next = head;
        head = newNode;
      } while(curr.next !null && curr.next.value !=value){
        curr = curr.next;
      } if(curr.next != null){
        Node insert = curr.next;
        curr.next = newNode;
        newNode.next = insert;
        return;
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



