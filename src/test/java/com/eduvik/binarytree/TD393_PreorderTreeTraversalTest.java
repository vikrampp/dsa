package com.eduvik.binarytree;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import com.eduvik.ds.pojo.TreeNode;

public class TD393_PreorderTreeTraversalTest {

  private TD393_PreorderTreeTraversal object;

  @Before
  public void init() {
    object = new TD393_PreorderTreeTraversal();
  }

  @Test
  public void findPreorderTraversal1() {
    List<Integer> answer = Arrays.asList(1, 2, 4, 3, 5, 7, 8, 6);
    TreeNode root = getTree1();
    List<Integer> result = object.findPreorderTraversal(root);
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
