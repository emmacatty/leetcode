package com.leetcode.P50;

import com.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-20
 */
public class C508_MostFrequentSubtreeSumTest {
    C508_MostFrequentSubtreeSum c508_mostFrequentSubtreeSum = new C508_MostFrequentSubtreeSum();
    @Test
    public void testFindFrequentTreeSum() throws Exception {
        TreeNode t5 = new TreeNode(5);
        TreeNode t2 = new TreeNode(2);
        TreeNode t_3 = new TreeNode(-3);
        t5.left = t2;
        t5.right = t_3;
        int[] res = c508_mostFrequentSubtreeSum.findFrequentTreeSum(t5);
        for (int i : res) {
            System.out.print(i);
        }
    }
}