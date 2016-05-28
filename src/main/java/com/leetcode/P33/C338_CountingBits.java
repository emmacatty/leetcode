package com.leetcode.P33;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-07
 */
public class C338_CountingBits {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        int pow = 1;
        for (int i = 1, p = 0; i <= num; i++, p++) {
            if (i == pow) {
                pow *= 2;
                p = 0;
            }
            res[i] = res[p] + 1;
        }
        return res;
    }
}
