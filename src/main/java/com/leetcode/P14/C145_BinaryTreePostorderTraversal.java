package com.leetcode.P14;

import com.leetcode.common.ListNode;
import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-06
 */
public class C145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<Integer>();
        if (root == null) {
            return postorder;
        }
        Stack<TreeNode> stk = new Stack<TreeNode>();
        stk.push(root);
        TreeNode prev = new TreeNode(0);
        prev.left = root;
        while (!stk.isEmpty()) {
            TreeNode cur = stk.peek();
            if (cur.left == null && cur.right == null) {
                postorder.add(cur.val);
                prev = cur;
                stk.pop();
            } else {
                if (prev != null && (prev.left == cur || prev.right == cur)) {
                    if (cur.left != null) {
                        stk.push(cur.left);
                        prev = cur;
                    } else {
                        prev = null;
                    }
                } else if (prev == cur.left) {
                    if (cur.right != null) {
                        stk.push(cur.right);
                        prev = cur;
                    } else {
                        prev = null;
                    }
                } else if (prev == cur.right) {
                    postorder.add(cur.val);
                    prev = cur;
                    stk.pop();
                }
            }
        }
        return postorder;
    }
}
