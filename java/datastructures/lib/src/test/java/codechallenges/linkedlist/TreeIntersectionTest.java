package codechallenges.linkedlist;

import datastructures.TreeIntersection.cs.tree_intersection.java.TreeIntersection;
import datastructures.trees.Node;
import datastructures.trees.Trees;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TreeIntersectionTest {
  @Test
  public void TreeIntersection(){
    Trees trees1 = new Trees();
    trees1.root = new Node(150);
    trees1.root.left = new Node(100);
    trees1.root.right = new Node(250);
    trees1.root.left.left = new Node(75);
    trees1.root.right.right = new Node(350);
    trees1.root.left.right = new Node(160);
    trees1.root.right.left = new Node(200);

    Trees trees2 = new Trees();
    trees2.root = new Node(42);
    trees2.root.left = new Node(100);
    trees2.root.right = new Node(600);
    trees2.root.left.left = new Node(15);
    trees2.root.right.right = new Node(350);
    trees2.root.left.right = new Node(160);
    trees2.root.right.left = new Node(200);

    Set<Integer> intersection = TreeIntersection.treeIntersection(trees1, trees2);
    Set<Integer> expected = Set.of(100, 350, 160, 200);
    assertEquals(expected, intersection);

  }

}
