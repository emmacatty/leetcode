package com.leetcode.P50;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-20
 */
public class C508_MostFrequentSubtreeSum {
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    private int maxFrequent = 0;
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        traverseTree(root);
        List<Integer> res = new ArrayList<Integer>();
        for (int i : map.keySet()){
            if (map.get(i) == maxFrequent) {
                res.add(i);
            }
        }
        int[] rres = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            rres[i] = res.get(i);
        }
        return rres;
    }

    private int traverseTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = traverseTree(root.left);
        int right = traverseTree(root.right);
        int subTreeSum = left + right + root.val;
        int count = 0;
        if (map.containsKey(subTreeSum)) {
            count = map.get(subTreeSum);
        }
        count += 1;
        if (count > maxFrequent) {
            maxFrequent = count;
        }
        map.put(subTreeSum, count);
        return subTreeSum;
    }

}
