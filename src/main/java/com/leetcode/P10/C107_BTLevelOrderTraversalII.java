package com.leetcode.P10;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-06
 */
public class C107_BTLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<List<Integer>>();
        if (root == null) {
            return levelOrder;
        }
        List<TreeNode> qu = new ArrayList<TreeNode>();
        qu.add(root);
        Stack<List<Integer>> tmp = new Stack<List<Integer>>();
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
            tmp.push(level);
        }
        while (!tmp.isEmpty()) {
            levelOrder.add(tmp.pop());
        }
        return levelOrder;
    }
}
