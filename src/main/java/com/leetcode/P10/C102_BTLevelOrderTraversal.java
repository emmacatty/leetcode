package com.leetcode.P10;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-06
 */
public class C102_BTLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<List<Integer>>();
        if (root == null) {
            return levelOrder;
        }
        List<TreeNode> qu = new ArrayList<TreeNode>();
        qu.add(root);
        while (!qu.isEmpty()) {
            int size = qu.size();
            List<Integer> level = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = qu.get(0);
                level.add(cur.val);
                if (cur.left != null) {
                    qu.add(cur.left);
                }
                if (cur.right != null) {
                    qu.add(cur.right);
                }
                qu.remove(0);
            }
            levelOrder.add(level);
        }
        return levelOrder;
    }
}
