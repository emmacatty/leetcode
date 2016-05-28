package com.leetcode.P21;

import java.util.HashSet;
import java.util.Set;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-05-15
 */
public class C217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> tmp = new HashSet<Integer>();
        for (int i : nums) {
            tmp.add(i);
        }
        if (tmp.size() < nums.length) {
            return true;
        }
        return false;
    }
}
