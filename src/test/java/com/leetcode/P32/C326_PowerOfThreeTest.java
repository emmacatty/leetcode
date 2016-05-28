package com.leetcode.P32;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-29
 */
public class C326_PowerOfThreeTest {

    @Test
    public void testIsPowerOfThree() throws Exception {
        C326_PowerOfThree example = new C326_PowerOfThree();
        assertTrue(example.isPowerOfThree(9));
        assertTrue(example.isPowerOfThree(81));
        assertFalse(example.isPowerOfThree(12));
    }
}