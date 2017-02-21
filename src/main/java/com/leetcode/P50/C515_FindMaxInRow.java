package com.leetcode.P50;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-20
 */
public class C515_FindMaxInRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        List<TreeNode> qu = new ArrayList<TreeNode>();
        qu.add(root);
        while (!qu.isEmpty()) {
            int size = qu.size();
            int maxVal = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode cur = qu.get(0);
                if (maxVal < cur.val) {
                    maxVal = cur.val;
                }
                if (cur.left != null) {
                    qu.add(cur.left);
                }
                if (cur.right != null) {
                    qu.add(cur.right);
                }
                qu.remove(0);
            }
            res.add(maxVal);
        }
        return res;
    }
}
