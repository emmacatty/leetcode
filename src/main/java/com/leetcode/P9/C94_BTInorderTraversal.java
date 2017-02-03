package com.leetcode.P9;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-03
 */
public class C94_BTInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        inorderTraversalCore(root, inorder);
        return inorder;
    }
    private void inorderTraversalCore(TreeNode root, List<Integer> inorder) {
        if (root == null) {
            return;
        }
        inorderTraversalCore(root.left, inorder);
        inorder.add(root.val);
        inorderTraversalCore(root.right, inorder);
    }

    public List<Integer> inorderTraversalII(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        if (root == null) {
            return inorder;
        }
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);
        TreeNode prev = new TreeNode(0);
        prev.left = root;
        while (!stk.isEmpty()) {
            TreeNode tn = stk.peek();
            if (tn.left == null && tn.right == null) {
                inorder.add(tn.val);
                stk.pop();
                prev = tn;
            } else {
                if (prev != null && (prev.left == tn || prev.right == tn)) {
                    if (tn.left != null) {
                        stk.push(tn.left);
                        prev = tn;
                    } else {
                        prev = null;
                    }
                } else if (prev == tn.left) {
                    inorder.add(tn.val);
                    if (tn.right != null) {
                        stk.push(tn.right);
                        prev = tn;
                    } else {
                        prev = null;
                    }
                } else if (prev == tn.right) {
                    stk.pop();
                    prev = tn;
                }
            }
        }
        return inorder;
    }
}
