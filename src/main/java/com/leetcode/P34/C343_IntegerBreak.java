package com.leetcode.P34;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-02
 */
public class C343_IntegerBreak {
    public int integerBreak(int n){
        if (n < 2) {
            return 0;
        }
        if (n == 2){
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int pow = n/3;
        int factor = 1;
        if (n%3 == 1) {
            pow--;
            factor = 4;
        } else if (n % 3 == 2) {
            factor = 2;
        }
        return (int)Math.pow(3, pow)*factor;
    }
}
