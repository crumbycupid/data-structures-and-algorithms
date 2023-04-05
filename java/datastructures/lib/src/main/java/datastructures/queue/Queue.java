package datastructures.queue;

import datastructures.queue.Node;

public class Queue<T>
{
  Node<T> front = null;
  Node<T> back = null;

  private int size = 0;

  public Queue(){}

  public T enqueue(T valueToEnqueue)
  {
    Node<T> newNode = new Node<>(valueToEnqueue);
    if
    (size == 0)
    front = newNode;
  else{
      back.next = newNode;
      back = newNode;
      size ++;
    }
    return valueToEnqueue;
  }

  public T dequeue()
  {
    T output = front.value;
    front = front.next;
    size--;
    return output;
  }

  public T peek()
  {
    return front.value;
  }

  public boolean isEmpty()
  {
    return size == 0;
  }
}
