package com.leetcode.P22;

import com.leetcode.common.ListNode;
import com.leetcode.common.TreeNode;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-03
 */
public class C226_InvertBT {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
