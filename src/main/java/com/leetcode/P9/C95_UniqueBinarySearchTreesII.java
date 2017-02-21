package com.leetcode.P9;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Pack200;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-12
 */
public class C95_UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        List<List<TreeNode>> arr = new ArrayList<List<TreeNode>>();
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (n == 0) {
            return list;
        }
        list.add(null);
        arr.add(0, list);
        for (int i = 1; i <=n; i++) {
            List<TreeNode> sub = new ArrayList<TreeNode>();
            for (int j = 0; j < i; j++) {
                for (TreeNode left : arr.get(j)) {
                    for (TreeNode right : arr.get(i - j - 1)) {
                        TreeNode root = new TreeNode(j+1);
                        root.left = left;
                        root.right = shiftTree(right, j+1);
                        sub.add(root);
                    }
                }
            }
            arr.add(i, sub);
        }
        return arr.get(n);
    }

    private TreeNode shiftTree(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        TreeNode tn = new TreeNode(root.val + val);
        tn.left = shiftTree(root.left, val);
        tn.right = shiftTree(root.right, val);
        return tn;
    }
}
