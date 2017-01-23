package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-10-13
 */
public class Cex1_Generator {
    private int genFun(int a, int b) {
        return (a+b)%13;
    }
    public List<Integer> genenateArray(int a, int b, int num) {
        List<Integer> arr = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        arr.add(a);
        arr.add(b);
        set.add(a);
        set.add(b);
        for (int start = 1; start < arr.size(); start++) {
            for (int i = 0; i < start; i++) {
                if (arr.size() == num) {
                    break;
                }
                int c = genFun(arr.get(start), arr.get(i));
                if (!set.contains(c)) {
                    arr.add(c);
                    set.add(c);
                }
            }
        }
        return arr;
    }
}
