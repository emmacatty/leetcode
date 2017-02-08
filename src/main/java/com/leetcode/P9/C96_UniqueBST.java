package com.leetcode.P9;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-04
 */
public class C96_UniqueBST {
    public int numTrees(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += numTrees(i)*numTrees(n - 1 - i);
        }
        return res;
    }
}
