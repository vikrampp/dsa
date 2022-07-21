package com.eduvik.binarytree;

import java.util.ArrayList;
import java.util.List;
import com.eduvik.ds.pojo.TreeNode;

/**
 * Problem link: https://techiedelight.com/practice/?problem=PreorderTreeTraversal
 * <p>
 * Editorial link: https://www.techiedelight.com/preorder-tree-traversal-iterative-recursive/
 * <p>
 * Difficulty: Easy
 * 
 * @author Vikram P.
 *
 */
public class TD393_PreorderTreeTraversal {

  public List<Integer> findPreorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    findPreorderTraversal(root, list);
    return list;
  }

  /**
   * Recursive solution
   * 
   * @param root
   * @param list
   */
  private void findPreorderTraversal(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    list.add(root.val);
    findPreorderTraversal(root.left, list);
    findPreorderTraversal(root.right, list);
  }
}
