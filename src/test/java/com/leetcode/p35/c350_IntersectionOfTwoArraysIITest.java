package com.leetcode.p35;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/5/29
 */
public class c350_IntersectionOfTwoArraysIITest {
    @Test
    public void intersect() throws Exception {
        c350_IntersectionOfTwoArraysII example = new c350_IntersectionOfTwoArraysII();
        int[] nums1 = {4,7,9,7,6,7};
        int[] nums2 = {5,0,0,6,1,6,2,2,4};
        int[] res = {4,6};
        assertArrayEquals(res, example.intersect(nums1,nums2));
    }

}