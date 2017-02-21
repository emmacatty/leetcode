package com.leetcode.P9;

import com.leetcode.common.TreeNode;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-15
 */
public class C99_RecoverBST {
    private TreeNode mis1 = null;
    private TreeNode mis2 = null;
    private TreeNode prev = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        traverse(root);
        int tmp = mis1.val;
        mis1.val = mis2.val;
        mis2.val = tmp;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        if (mis1 == null && prev.val > root.val) {
                mis1 = prev;
        }
        if (mis1 != null && prev.val > root.val) {
                mis2 = root;
        }
        prev = root;
        traverse(root.right);
    }

}
