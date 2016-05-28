package com.leetcode.P33;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-18
 */
public class C334_IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int min=nums[0], mid=Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > min) {
                if (nums[i] > mid) {
                    return true;
                }
                mid = nums[i];
            }

        }
        return false;
    }
}
