package com.leetcode.P10;

import com.leetcode.common.TreeNode;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-03
 */
public class C100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
