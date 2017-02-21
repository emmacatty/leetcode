package com.leetcode.P49;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-21
 */
public class C494_TargetSum {
    private int ways = 0;
    public int findTargetSumWays(int[] nums, int S) {
        core(nums, 0, 0, S);
        return ways;
    }

    public void core(int[] nums, int end, int sum, int S) {
        if (end == nums.length - 1) {
            if (sum + nums[end] == S) {
                ways++;
            }
            if (sum - nums[end] == S) {
                ways++;
            }
            return;
        }
        core(nums, end+1,  sum + nums[end], S);
        core(nums, end+1, sum - nums[end], S);
    }

}
