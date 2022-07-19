package com.eduvik.ds.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * For single threaded environment
 * 
 * @author Vikram P.
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int val) {
    this.val = val;
  }
}
