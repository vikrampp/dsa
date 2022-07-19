package com.eduvik.binarytree;

import java.util.ArrayList;
import java.util.List;
import com.eduvik.ds.pojo.TreeNode;

/**
 * Problem link: https://techiedelight.com/practice/?problem=InorderTreeTraversal
 * <p>
 * Editorial link: https://www.techiedelight.com/inorder-tree-traversal-iterative-recursive/
 * <p>
 * Difficulty: Easy
 * 
 * @author Vikram P.
 *
 */
public class TD392_InOrderTraversal {

  public List<Integer> findInorderTraversal(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    findInorderTraversal(root, list);
    return list;
  }

  private void findInorderTraversal(TreeNode root, List<Integer> list) {
    if (root == null) {
      return;
    }
    findInorderTraversal(root.left, list);
    list.add(root.val);
    findInorderTraversal(root.right, list);
  }
}
