package com.leetcode.p35;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/5/29
 */
public class c350_IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }
        }

        int[] re = new int[res.size()];
        int index = 0;
        for (int k : res){
            re[index++] = k;
        }
        return re;
    }
}