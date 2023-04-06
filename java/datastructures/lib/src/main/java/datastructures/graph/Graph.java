package datastructures.graph;

import datastructures.linkedlist.Node;

import datastructures.graph.Edge;
import datastructures.graph.Vertex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>> {

  public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
  private int numberOfVertices = 0;

  public Graph(int numberOfVertices) {
    this.numberOfVertices = numberOfVertices;
  }

  public Vertex<T> addVertex(T value)  // addNode()
  {
    Vertex<T> newVertex = new Vertex<>(value);
    if(adjacencyLists.get(newVertex) == null){
      adjacencyLists.put(newVertex, null);
      numberOfVertices ++;
    }
    return newVertex;
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination)
  {
    addEdge(start, destination, 0);
  }

  public void addEdge(Vertex<T> start, Vertex<T> destination, int weight)
  {
    Edge<T> newEdge = new Edge<>(destination, weight);
    if(adjacencyLists.get(start) == null){
      LinkedList<Edge<T>> newLinkedList= new LinkedList<>();
      newLinkedList.add(newEdge);
      adjacencyLists.put(start, newLinkedList);
    }else {
      LinkedList<Edge<T>> existingLinkedList = adjacencyLists.get(start);
      existingLinkedList.add(newEdge);
      adjacencyLists.put(start, existingLinkedList);
    }
  }

  public LinkedList<Vertex<T>> getVertices()  // getNodes()
  {
    LinkedList<Vertex<T>> list = new LinkedList<>();
    for (Vertex<T> vertex : adjacencyLists.keySet()){
      list.add(vertex);
    }
    return list;
  }

//  public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex)
//  {
//    LinkedList<Edge<T>> list = new LinkedList<>();
//    LinkedList<Edge<T>> edgeLinkedList = adjacencyLists.get(vertex);
//    if(edgeLinkedList !=null){
//      Node current;
//      current = edgeLinkedList.
//    }
//    return list;
//  }



  public int size()
  {
    return numberOfVertices;  // TODO: make sure this gets updated at the right times
  }

  @Override
  public int compareTo(Graph<T> o)
  {
    throw new UnsupportedOperationException("Graph does not implement compareTo()");
  }

  @Override
  public String toString()
  {
    // Good for testing
    // WARNING: Your HashMap does not guarantee ordering!
    // But you can basically rely on it if you add nodes to your graphs in a consistent way

    return "";
  }
}
