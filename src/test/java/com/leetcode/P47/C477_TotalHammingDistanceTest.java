package com.leetcode.P47;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-01-23
 */
public class C477_TotalHammingDistanceTest {
    C477_TotalHammingDistance c477_totalHammingDistance = new C477_TotalHammingDistance();
    @Test
    public void testTotalHammingDistance() throws Exception {
        int[] input = {4, 14, 2};
        assertEquals(6, c477_totalHammingDistance.totalHammingDistance(input));
    }
}