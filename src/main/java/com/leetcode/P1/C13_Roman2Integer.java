package com.leetcode.P1;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-01-25
 */
public class C13_Roman2Integer {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] numbers = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    numbers[i] = 1;
                    break;
                case 'V':
                    numbers[i] = 5;
                    break;
                case 'X':
                    numbers[i] = 10;
                    break;
                case 'L':
                    numbers[i] = 50;
                    break;
                case 'C':
                    numbers[i] = 100;
                    break;
                case 'D':
                    numbers[i] = 500;
                    break;
                case 'M':
                    numbers[i] = 1000;
                    break;
            }
        }

        int res = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                res -= numbers[i];
            } else {
                res += numbers[i];
            }
        }
        res += numbers[numbers.length - 1];
        return res;
    }
}
