package com.leetcode.P11;

import com.leetcode.common.TreeNode;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-06
 */
public class C110_BalancedBT {
    public boolean isBalanced(TreeNode root) {
        return hight(root) != -1;
    }

    private int hight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = hight(root.left);
        int rh = hight(root.right);
        if (lh == -1) {
            return -1;
        }
        if (rh == -1) {
            return -1;
        }
        if (Math.abs(lh - rh) > 1) {
            return -1;
        }
        return Math.max(lh, rh) + 1;
    }
}
