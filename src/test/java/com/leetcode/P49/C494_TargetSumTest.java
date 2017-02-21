package com.leetcode.P49;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-21
 */
public class C494_TargetSumTest {
    C494_TargetSum c494_targetSum = new C494_TargetSum();
    @Test
    public void testFindTargetSumWays() throws Exception {
        int[] num = {1,1,1,1,1};
        System.out.println(c494_targetSum.findTargetSumWays(num, 3));
    }
}