package com.leetcode.P38;

import java.util.Random;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-10-09
 */
public class C384_ShuffileArray {
    private int[] change;
    private int[] origin;
    private Random ra = new Random();
    public C384_ShuffileArray(int[] nums) {
        ra.setSeed(System.currentTimeMillis());
        change = new int[nums.length];
        origin = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            change[i] = nums[i];
            origin[i] = nums[i];
        }
    }

    public int[] reset() {
        return origin;
    }

    public int[] shuffle() {
        for (int i = 0; i < origin.length; i++) {
            int pos = ra.nextInt(origin.length-i) + i;
            int tmp = change[pos];
            change[pos] = change[i];
            change[i] = tmp;
        }
        return change;
    }
}
