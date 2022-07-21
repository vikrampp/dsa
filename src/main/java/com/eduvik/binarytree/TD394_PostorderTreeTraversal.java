package com.eduvik.binarytree;

import java.util.ArrayList;
import java.util.List;
import com.eduvik.ds.pojo.TreeNode;

/**
 * Problem link: https://techiedelight.com/practice/?problem=PostorderTreeTraversal
 * <p>
 * Editorial link: https://www.techiedelight.com/postorder-tree-traversal-iterative-recursive/
 * <p>
 * Difficulty: Easy
 * 
 * @author Vikram P.
 *
 */
public class TD394_PostorderTreeTraversal {

  public List<Integer> findPostorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    findPostorderTraversal(root, list);
    return list;
  }

  /**
   * Recursive solution
   * 
   * @param root
   * @param list
   */
  private void findPostorderTraversal(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    findPostorderTraversal(root.left, list);
    findPostorderTraversal(root.right, list);
    list.add(root.val);
  }
}
