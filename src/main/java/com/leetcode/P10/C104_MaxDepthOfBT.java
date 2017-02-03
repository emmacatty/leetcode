package com.leetcode.P10;

import com.leetcode.common.TreeNode;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-03
 */
public class C104_MaxDepthOfBT {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
