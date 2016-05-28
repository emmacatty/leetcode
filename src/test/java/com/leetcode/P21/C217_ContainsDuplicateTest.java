package com.leetcode.P21;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-05-15
 */
public class C217_ContainsDuplicateTest {

    @Test
    public void testContainsDuplicate() throws Exception {
        C217_ContainsDuplicate example = new C217_ContainsDuplicate();
        int[] input1 = {1,2,3,6,7,1};
        int[] input2 = {1,2,3,6,7};
        assertTrue(example.containsDuplicate(input1));
        assertFalse(example.containsDuplicate(input2));
    }
}