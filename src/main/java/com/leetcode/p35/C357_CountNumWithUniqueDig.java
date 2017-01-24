package com.leetcode.p35;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-01-24
 */
public class C357_CountNumWithUniqueDig {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int res = 10;
        int uniq = 9;
        int available = 9;
        while (n-- > 1 && available > 0) {
            uniq *= available;
            res += uniq;
            available--;
        }
        return res;
    }
}
