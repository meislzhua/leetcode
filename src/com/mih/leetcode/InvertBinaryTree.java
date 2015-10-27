package com.mih.leetcode;

/**
 * Created by meislzhua on 15/10/27.
 Invert a binary tree.

	         4
	       /   \
	      2     7
	     / \   / \
	    1   3 6   9
 to
	        4
	      /   \
	    7     2
	   / \   / \
	  9   6 3   1
 Trivia:
 This problem was inspired by this original tweet by Max Howell:
 Google: 90% of our engineers use the software you wrote (Homebrew), but you can’t invert a binary tree on a whiteboard so fuck off.
 */
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		//0ms
		if(root == null) return null;
		{
			TreeNode tmp = root.left;
			root.left = tmp.right;
			tmp.right = tmp;
		}
		if(root.left != null) invertTree(root.left);
		if(root.right != null) invertTree(root.right);
		return root;
	}
}
