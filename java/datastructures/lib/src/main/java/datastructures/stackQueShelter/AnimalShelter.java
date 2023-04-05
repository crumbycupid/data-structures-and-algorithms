package datastructures.stackQueShelter;

import datastructures.queue.Queue;

public class AnimalShelter {
  Queue<Cat> catQueue = new Queue<>();
  Queue<Dog> dogQueue = new Queue<>();

  public void enqueue (Cat cat){
    catQueue.enqueue(cat);
  }

  public void enqueue (Dog dog){
    dogQueue.enqueue(dog);
  }

  public Animal dequeue (String preference){
    if (preference.toLowerCase().equals("cat")){
      return catQueue.dequeue();
    }else if (preference.toLowerCase().equals("dog")){
      return dogQueue.dequeue();
    } else{
      throw new IllegalArgumentException("Only cats and dogs");
    }
  }
}
