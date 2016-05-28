package com.leetcode.P33;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-18
 */
public class C334_IncreasingTripletSubsequenceTest {

    @Test
    public void testIncreasingTriplet() throws Exception {
        C334_IncreasingTripletSubsequence example = new C334_IncreasingTripletSubsequence();
        int[] test1 = new int[]{1,2,3,4,5};
        int[] test2 = new int[]{5,4,3,2,1};
        int[] test3 = new int[]{6,1,4,2,9,3,8};
        assertTrue(example.increasingTriplet(test1));
        assertFalse(example.increasingTriplet(test2));
        assertTrue(example.increasingTriplet(test3));
    }
}