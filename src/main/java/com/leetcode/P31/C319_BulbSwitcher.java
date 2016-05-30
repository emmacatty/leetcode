package com.leetcode.P31;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/5/29
 */
public class C319_BulbSwitcher {
    public int bulbSwitch(int n) {
        if (n == 1) {
            return 1;
        }
        int res = 0;
        for (int i = 2; i <=n; i++ ) {
            if (n%i == 0) {
                res++;
            }
        }
        return res;
    }
}
