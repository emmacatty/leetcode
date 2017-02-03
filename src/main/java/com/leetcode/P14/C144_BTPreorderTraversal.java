package com.leetcode.P14;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-03
 */
public class C144_BTPreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<Integer>();
        preorderTraversalCore(root, preorder);
        return preorder;
    }
    private void preorderTraversalCore(TreeNode root, List<Integer> preorder) {
        if (root == null) {
            return;
        }
        preorder.add(root.val);
        preorderTraversalCore(root.left, preorder);
        preorderTraversalCore(root.right, preorder);
    }

    public List<Integer> preorderTraversalII(TreeNode root) {
        List<Integer> preorder = new ArrayList<Integer>();
        if (root == null) {
            return preorder;
        }
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);
        TreeNode prev = new TreeNode(0);
        prev.left = root;
        while (!stk.isEmpty()) {
            TreeNode tn = stk.peek();
            if (tn.left == null && tn.right == null) {
                preorder.add(tn.val);
                stk.pop();
                prev = tn;
            } else {
                if (prev != null && (prev.left == tn || prev.right == tn)) {
                    preorder.add(tn.val);
                    if (tn.left != null) {
                        stk.push(tn.left);
                        prev = tn;
                    } else {
                        prev = null;
                    }
                } else if (prev == tn.left) {
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
        return preorder;
    }
}
