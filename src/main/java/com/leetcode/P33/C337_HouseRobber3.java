package com.leetcode.P33;

import com.leetcode.common.TreeNode;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-15
 */
public class C337_HouseRobber3 {
    public  int rob (TreeNode root) {
        int[] res = robCore(root);
        return Math.max(res[0], res[1]);
    }

    private int[] robCore(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] leftRes = robCore(root.left);
        int[] rightRes = robCore(root.right);
        int[] res = new int[2];
        res[0] = Math.max(leftRes[0], leftRes[1]) + Math.max(rightRes[0], rightRes[1]);
        res[1] = root.val + leftRes[0] + rightRes[0];
        return res;
    }
}
