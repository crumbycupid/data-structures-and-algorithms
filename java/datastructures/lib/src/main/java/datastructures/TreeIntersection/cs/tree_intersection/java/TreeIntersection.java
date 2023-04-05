package datastructures.TreeIntersection.cs.tree_intersection.java;

import com.google.common.graph.Traverser;
import com.sun.source.tree.Tree;
import datastructures.trees.Node;
import datastructures.trees.Trees;


import java.util.HashSet;
import java.util.Set;

public class TreeIntersection{

  public static Set<Integer> treeIntersection(Trees trees1, Trees trees2){
    Set<Integer>set = new HashSet<>();
    if(trees1.root == null || trees2.root ==null){
      return set;
    }
    Set<Integer>set1 = new HashSet<>();
    Set<Integer>set2 = new HashSet<>();
    traverse(trees1.root, set1);
    traverse(trees2.root, set2);
    for (Integer value : set1){
      if(set2.contains(value)){
        set.add(value);
      }
    }
    return set;
  }
  private static void traverse(Node node, Set<Integer> set){
    if (node == null) {
      return;
    }
    set.add((Integer) node.value);
    traverse(node.left, set);
    traverse(node.right, set);
  }

}
