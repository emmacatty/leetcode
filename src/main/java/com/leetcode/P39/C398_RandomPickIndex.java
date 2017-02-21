package com.leetcode.P39;

import java.util.Random;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-21
 */
public class C398_RandomPickIndex {
    private int[] nums;
    private Random ra;
    public C398_RandomPickIndex(int[] nums) {
        this.nums = nums;
        ra = new Random();
        ra.setSeed(System.currentTimeMillis());
    }

    public int pick(int target) {
        int i = 1;
        int res = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == target) {
                if (ra.nextInt(i) == 0) {
                    res = j;
                }
                i++;
            }
        }
        return res;
    }
}
