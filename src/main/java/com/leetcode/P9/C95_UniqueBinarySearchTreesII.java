package com.leetcode.P9;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-12
 */
public class C95_UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        List<List<TreeNode>> arr = new ArrayList<List<TreeNode>>();
        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(null);
        arr.add(0, list);
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                
            }
        }
    }
}
