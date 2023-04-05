package datastructures.trees;

public class Node <T> {
  // instance variables
  public Node <T> left;
  public Node <T> right;
  public T value;


  public Node() {}

  // constructor
  public Node (T value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  // allows for constructing the trees easier in tests,
  // since this allows for adding in the right and the left node.
  public Node(T value, Node<T> left, Node<T> right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }
}
