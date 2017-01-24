package com.leetcode.P40;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-01-24
 */
public class C401_BinaryWatch {
    private static final int[] hours = {1, 2, 4, 8};
    private static final int[] minutes = {1, 2, 4, 8, 16, 32};
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<String>();
        for (int i = 0; i <= num; i++) {
            List<Integer> hourRes = combine(hours, i);
            List<Integer> minRes = combine(minutes, num - i);
            for (int h : hourRes) {
                for (int m : minRes) {
                    String timeRes = readTime(h, m);
                    if (timeRes != null) {
                        res.add(timeRes);
                    }
                }
            }
        }
        return res;
    }

    private String readTime(int h, int m) {
        if (h > 11 || m > 59) {
            return null;
        }
        return String.valueOf(h) + ":" + (m < 10 ? "0" + String.valueOf(m) : String.valueOf(m));
    }

    private List<Integer> combine(int[] arr, int count) {
        List<Integer> res = new ArrayList<Integer>();
        combineCore(arr, count, 0, 0, res);
        return res;
    }

    private void combineCore(int[] arr, int count, int pos, int sum, List<Integer> res ) {
        if (count == 0) {
            res.add(sum);
            return;
        }

        for (int i = pos; i < arr.length; i++) {
            combineCore(arr, count - 1, i + 1, sum + arr[i], res);
        }
    }



}
