package com.leetcode.P23;

import com.leetcode.common.TreeNode;
import org.junit.Test;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-06
 */
public class C235_LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        if (root.val >= p.val && root.val <= q.val
                || root.val >= q.val && root.val <= p.val) {
            return root;
        }
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }
}
