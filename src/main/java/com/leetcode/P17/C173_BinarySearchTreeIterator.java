package com.leetcode.P17;

import com.leetcode.common.TreeNode;

import java.util.Stack;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-04
 */
public class C173_BinarySearchTreeIterator {
    private Stack<TreeNode> stk = new Stack<TreeNode>();

    public C173_BinarySearchTreeIterator(TreeNode root) {
        pushAll(root);
    }

    public boolean hasNext() {
        return !stk.isEmpty();
    }

    public int next() {
        TreeNode tmp = stk.pop();
        pushAll(tmp.right);
        return tmp.val;
    }

    private void pushAll(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            stk.push(cur);
            cur = cur.left;
        }
    }
}
