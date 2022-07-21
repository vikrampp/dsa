package com.eduvik.binarytree;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import com.eduvik.ds.pojo.TreeNode;

public class TD394_PostorderTreeTraversalTest {

  private TD394_PostorderTreeTraversal object;

  @Before
  public void init() {
    object = new TD394_PostorderTreeTraversal();
  }

  @Test
  public void findPostorderTraversal1() {
    List<Integer> answer = Arrays.asList(4, 2, 7, 8, 5, 6, 3, 1);
    TreeNode root = getTree1();
    List<Integer> result = object.findPostorderTraversal(root);
    assertEquals(answer, result);
  }

  private TreeNode getTree1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);
    root.right.left.left = new TreeNode(7);
    root.right.left.right = new TreeNode(8);
    return root;
  }
}
