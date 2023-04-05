package datastructures.stack;

public class Stack<T>
{
  private Node<T> top = null;
  private int size = 0;
  public int size(){
    return size;
  }

  public void push(T valueToPush)
  {
    Node<T> newTop = new Node<>(valueToPush);
    newTop.next = top;
    top = newTop;
    size++;
  }

  public T pop()
  {
    Node<T> temp = top;
    top = top.next;
    size--;
    return temp.value;
  }

  public T peek()
  {
    return top.value;
  }

  public boolean isEmpty()
  {
    return size == 0;
  }
}

//![image](blob:https://miro.com/fae1c54a-13c1-48fe-b94e-b138eb403b28)
