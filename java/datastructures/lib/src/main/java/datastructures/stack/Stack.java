package datastructures.stack;

import datastructures.stack.Node;

public class Stack<T>
{
  private Node<T> top = null;
  private int size = 0;
  public int size(){
    return size;
  }

  void push(T valueToPush)
  {
    Node<T> newTop = new Node<>(valueToPush);
    newTop.next = top;
    top = newTop;
    size++;
  }

  T pop()
  {
    Node<T> temp = top;
    top = top.next;
    size--;
    return temp.value;
  }

  T peek()
  {
    return top.value;
  }

  boolean isEmpty()
  {
    return size == 0;
  }
}

![image](blob:https://miro.com/fae1c54a-13c1-48fe-b94e-b138eb403b28)
