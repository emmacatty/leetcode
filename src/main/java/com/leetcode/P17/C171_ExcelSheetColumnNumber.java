package com.leetcode.P17;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-05-15
 */
public class C171_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int res = 0;
        int pow = 0;
        for (int i = s.length()-1; i >=0; i--) {
            int num = (int)s.charAt(i) - 64;
            res += num * Math.pow(26, pow++);
        }
        return res;
    }
}
