package com.leetcode.P31;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-11
 */
public class C312_BurstBalloons {
    public int maxCoins(int[] nums) {
        int[] board = new int[nums.length + 2];
        board[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            board[i+1] = nums[i];
        }
        board[board.length-1] = 1;
        int[][] dp = new int[board.length][board.length];
        for(int len = 1; len <= nums.length; len++) {
            for (int left=1; left<=nums.length+1-len; left++) {
                int right = left+len-1;
                for(int k=left; k <= right; k++) {
                    dp[left][right] = Math.max(dp[left][right], board[left-1]*board[k]*board[right+1]
                            + dp[left][k-1] + dp[k+1][right]);
                }
            }
        }
        return dp[1][nums.length];
    }

    public int maxCoinsBruteForce(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return nums[0]*nums[1]+Math.max(nums[0], nums[1]);
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            int[] temp = remove(nums, i);
            int result;
            result = getProduct(nums, i) + maxCoins(temp);
            if (res < result) {
                res = result;
            }
        }
        return res;
    }

    private int getProduct(int[] nums, int i) {
        if (i == 0) {
            return nums[i]*nums[i+1];
        } else if (i == nums.length-1) {
            return nums[i-1]*nums[i];
        } else {
            return nums[i-1]*nums[i]*nums[i+1];
        }
    }

    private int[] remove(int[] nums, int index) {
        int[] res = new int[nums.length - 1];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == index) {
                continue;
            }
            res[j++] = nums[i];
        }
        return res;
    }
}
