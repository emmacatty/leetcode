package com.leetcode.P19;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-04
 */
public class C199_BTRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        List<TreeNode> qu = new ArrayList<TreeNode>();
        qu.add(root);
        while (!qu.isEmpty()) {
            int size = qu.size();
            res.add(qu.get(size-1).val);
            for (int  i = 0; i < size; i++) {
                TreeNode cur = qu.get(0);
                if (cur.left != null) {
                    qu.add(cur.left);
                }
                if (cur.right != null) {
                    qu.add(cur.right);
                }
                qu.remove(0);
            }
        }
        return res;
    }
}
