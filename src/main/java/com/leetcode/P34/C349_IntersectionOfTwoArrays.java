package com.leetcode.P34;

import java.util.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-05-27
 */
public class C349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<Integer>();
        for (int i : nums1) {
            s1.add(i);
        }
        Set<Integer> s2 = new HashSet<Integer>();
        for (int i : nums2) {
            s2.add(i);
        }
        List<Integer> res = new ArrayList<Integer>();
        Iterator<Integer> iter = s1.iterator();
        while (iter.hasNext()) {
            int i = iter.next();
            if (s2.contains(i)) {
                res.add(i);
            }
        }
        int[] re = new int[res.size()];
        int index = 0;
        for (int i : res) {
            re[index++] = i;
        }
        return re;
    }
}
