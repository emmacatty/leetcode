package com.leetcode.P33;

import com.leetcode.P33.C338_CountingBits;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-07
 */
public class C338_CountingBitsTest {

    @org.junit.Test
    public void testCountBits() throws Exception {
        C338_CountingBits test = new C338_CountingBits();
        int[] res = test.countBits(5);
        int[] expectRes = {0,1,1,2,1,2};
        assertArrayEquals(res, expectRes);

        String aa = "";
        if (aa.isEmpty()) {
            System.out.println("test is empty");
        } else {
            System.out.println("wrong");
        }



    }
}