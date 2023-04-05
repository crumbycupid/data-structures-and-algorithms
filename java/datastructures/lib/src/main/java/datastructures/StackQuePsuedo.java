package datastructures;

import datastructures.stack.Stack;

public class StackQuePsuedo<T> {
  public Stack<T> back;
  public Stack<T> front;

  StackQuePsuedo(){
    back = new Stack<T>();
    front = new Stack<T>();
  }

  T dequeue(){
    if(front.isEmpty()){
      while(!back.isEmpty()){
        front.push(back.pop());
      }
    }
    return front.pop();
  }
  void enqueue(T value){
    back.push(value);
  }

}
