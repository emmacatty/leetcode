package com.leetcode.P10;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-08
 */
public class C103_BTZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zig = new ArrayList<List<Integer>>();
        if (root == null) {
            return zig;
        }
        List<TreeNode> qu = new ArrayList<TreeNode>();
        boolean direct = true;
        qu.add(root);
        while(!qu.isEmpty()) {
            int size = qu.size();
            List<Integer> level = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = qu.get(0);
                if (direct) {
                    level.add(cur.val);
                } else {
                    level.add(0, cur.val);
                }
                if (cur.left != null) {
                    qu.add(cur.left);
                }
                if (cur.right != null) {
                    qu.add(cur.right);
                }
                qu.remove(0);
            }
            zig.add(level);
            direct = !direct;
        }
        return zig;
    }
}
