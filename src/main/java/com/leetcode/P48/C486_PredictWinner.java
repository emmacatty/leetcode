package com.leetcode.P48;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-01-25
 */
public class C486_PredictWinner {
    public boolean PredictTheWinner(int[] nums) {
        if (nums.length <= 0) {
            return true;
        }
        int score = getScore(nums);
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (score >= sum - score) {
            return true;
        }
        return false;
    }

    private int getScore(int[] nums) {
        return getScoreCore(nums, 0, nums.length - 1, true);
    }

    private int getScoreCore(int[] nums, int start, int end, boolean take) {
        if (start == end) {
            if (take) {
                return nums[start];
            } else {
                return 0;
            }
        }
        if (take) {
            return Math.max(nums[start] + getScoreCore(nums, start + 1, end, !take), nums[end] + getScoreCore(nums, start, end - 1, !take));
        } else {
            return Math.min(getScoreCore(nums, start + 1, end, !take), getScoreCore(nums, start, end - 1, !take));
        }
    }
}
