package com.leetcode.P28;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-04
 */
public class C287_FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int low = 0, high = nums.length-1;
        int mid = nums.length/2;
        while (low + 1 < high) {
            int count = 0;
            for (int i : nums) {
                if (i <= mid) {
                    count++;
                }
            }
            if (count > mid) {
                high = mid;
            } else {
                low = mid;
            }
            mid = (low+high+1)/2;
        }
        return mid;
    }
}
