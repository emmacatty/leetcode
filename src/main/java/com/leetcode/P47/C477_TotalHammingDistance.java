package com.leetcode.P47;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-01-23
 */
public class C477_TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int[] numOfOnes = new int[32];
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < nums.length; j++) {
                numOfOnes[i] += (nums[j] >> i) & 1;
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += (nums.length - numOfOnes[i]) * numOfOnes[i];
        }
        return res;
    }
}
