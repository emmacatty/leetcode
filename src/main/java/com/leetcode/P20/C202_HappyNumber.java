package com.leetcode.P20;

import java.util.HashSet;
import java.util.Set;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-16
 */
public class C202_HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(true) {
            if (n == 1) {
                return true;
            } else if (set.contains(n)){
                return false;
            }
            set.add(n);
            int next = 0;
            while (n != 0) {
                next += Math.pow(n%10, 2);
                n = n/10;
            }
            n = next;
        }
    }
}
