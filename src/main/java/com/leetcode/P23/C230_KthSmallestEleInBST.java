package com.leetcode.P23;

import com.leetcode.common.TreeNode;

import java.util.Stack;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-05
 */
public class C230_KthSmallestEleInBST {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);
        TreeNode prev = new TreeNode(0);
        prev.left = root;
        int count = 1;
        while (!stk.isEmpty()) {
            TreeNode node = stk.peek();
            if (node.left != null
                    && (prev.left == node || prev.right == node)) {
                stk.push(node.left);
            } else if (node.right != null && node.right != prev) {
                if (count == k) {
                    return node.val;
                } else {
                    count++;
                }
                stk.push(node.right);
            } else {
                stk.pop();
                if (node.right == null) {
                    if (count == k) {
                        return node.val;
                    } else {
                        count++;
                    }
                }
            }
            prev = node;
        }
        return 0;
    }

    //order = 0, pred
    //order = 1, inorder
    //order = 2, postorder
    public void traverseTree(TreeNode root, int order) {
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);
        TreeNode prev = new TreeNode(0);
        prev.left = root;
        while (!stk.isEmpty()) {
            TreeNode node = stk.peek();
            if (node.left != null
                    && (prev.left == node || prev.right == node)) {
                if (order == 0) {
                    System.out.println(node.val);
                }
                stk.push(node.left);
            } else if (node.right != null && node.right != prev) {
                if (order == 1 ) {
                    System.out.println(node.val);
                }
                stk.push(node.right);
            } else {
                stk.pop();
                if (order == 0 && node.left == null) {
                    System.out.println(node.val);
                }
                if (order == 1 && node.right == null) {
                    System.out.println(node.val);
                }
                if (order == 2) {
                    System.out.println(node.val);
                }
            }
            prev = node;
        }
    }
}
