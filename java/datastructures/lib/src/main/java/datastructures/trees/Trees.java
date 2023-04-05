package datastructures.trees;
import java.util.*;


public class Trees <T> {
  public Node<T> root;
  public Trees(){
    root = null;
  }
  public Trees(Node<T> root){
    this.root = root;
  }
  public List<T> breadthFirstTraverse (Node<T> root) {
    Queue<Node<T>> storageQ = new LinkedList<>();
    List<T> result = new LinkedList<>();

    if (root == null) {
      throw new NoSuchElementException();
    } else {
      storageQ.add(root);
    }
    while (!storageQ.isEmpty()) {
      Node<T> currNode = storageQ.remove();
      result.add(currNode.value);

      System.out.println("current result is " + result);
      System.out.println("current queue has " + storageQ);
      System.out.println("current node is " + currNode.value);

      if (currNode !=null && currNode.left != null) {
        storageQ.add(currNode.left);
      }
      if (currNode != null && currNode.right != null) {
        storageQ.add(currNode.right);
      }
    }
    return result;
  }


}
