package datastructures.linkedlist;

import datastructures.linkedlist.Node;

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

    public void insertBefore(int value, int newValue){
      Node prev = null;
      Node curr = head;

      if (head != null) {
        while (curr != null) {
          if (curr.value == value) {
            Node before = new Node(newValue);
            before.next = curr;

            if (prev != null) {
              prev.next = before;
            } else {
              head = before;
            }
            return;
          }
        }
        prev = curr;
        curr = curr.next;
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

    public void insertAfter(int value, int newValue){
      Node newNode = new Node(value);
      Node curr = head;
      while(curr !=null){
        if(curr.value == value){
          newNode.next = curr.next;
          curr.next = newNode;
        }
        curr = curr.next;
      }
    }


    @Override
    public String toString()
    { Node curr = head;
      String output = "";
      while(curr != null){
        output += "{ " + curr.value + " }";
      }
      output += "NULL";
      return output;
    }
}



