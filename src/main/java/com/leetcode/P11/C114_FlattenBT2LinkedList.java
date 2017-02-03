package com.leetcode.P11;

import com.leetcode.common.TreeNode;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-03
 */
public class C114_FlattenBT2LinkedList {
    public void flatten(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left == null) {
                cur = cur.right;
            } else {
                TreeNode right = cur.right;
                cur.right = cur.left;
                cur.left =  null;
                TreeNode rightmost = cur.right;
                while (rightmost.right != null) {
                    rightmost = rightmost.right;
                }
                rightmost.right = right;
            }
        }
    }
}
