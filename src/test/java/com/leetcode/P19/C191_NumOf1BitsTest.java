package com.leetcode.P19;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-11
 */
public class C191_NumOf1BitsTest {

    @Test
    public void testHamingWeight() throws Exception {
        C191_NumOf1Bits example = new C191_NumOf1Bits();
        assertEquals(1, example.hamingWeight(Integer.MAX_VALUE + 1));
    }
}