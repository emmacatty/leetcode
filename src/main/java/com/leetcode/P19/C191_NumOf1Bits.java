package com.leetcode.P19;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-11
 */
public class C191_NumOf1Bits {
    public int hamingWeight(int n) {
        int result = 0;
        while(n != 0) {
            result += (n & 1);
            n = n >>> 1;
        }
        return result;
    }
}
