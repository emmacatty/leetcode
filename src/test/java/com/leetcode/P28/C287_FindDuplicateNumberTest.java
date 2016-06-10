package com.leetcode.P28;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-05
 */
public class C287_FindDuplicateNumberTest {

    @Test
    public void testFindDuplicate() throws Exception {
        C287_FindDuplicateNumber example = new C287_FindDuplicateNumber();
        int[] nums = {1,1,2};
        assertEquals(1, example.findDuplicate(nums));
    }
}