package com.leetcode.P16;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-05-28
 */
public class C169_MajorityElementTest {

    @Test
    public void testMajorityElement() throws Exception {
        C169_MajorityElement example = new C169_MajorityElement();
        int[] in = {1,1,2,2,1,3,1};
        assertEquals(1, example.majorityElement(in));
    }
}