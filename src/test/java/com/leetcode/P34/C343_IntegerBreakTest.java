package com.leetcode.P34;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-02
 */
public class C343_IntegerBreakTest {

    @Test
    public void testIntegerBreak() throws Exception {
        C343_IntegerBreak example = new C343_IntegerBreak();
        assertEquals(4, example.integerBreak(4));
        assertEquals(6, example.integerBreak(5));
        assertEquals(12, example.integerBreak(7));
        assertEquals(18, example.integerBreak(8));
    }
}