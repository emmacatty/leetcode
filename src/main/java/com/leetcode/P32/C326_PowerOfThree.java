package com.leetcode.P32;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-29
 */
public class C326_PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        int maxPowerOfThree  = (int) Math.pow(3, (int)(Math.log(Integer.MAX_VALUE)/Math.log(3)));
        return  maxPowerOfThree%n == 0;
    }
}
