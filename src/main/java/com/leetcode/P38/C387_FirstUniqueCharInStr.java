package com.leetcode.P38;

import java.util.HashMap;
import java.util.Map;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-10-09
 */
public class C387_FirstUniqueCharInStr {
    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }
        int[] count = new int[26];
        int[] pos = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (pos[s.charAt(i)-'a'] == 0) {
                pos[s.charAt(i)-'a'] = i;
            }
            count[s.charAt(i)-'a'] += 1;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (count[i] == 1) {
                res = Math.min(res, pos[i]);
            }
        }
        if (res == Integer.MAX_VALUE) {
            res = -1;
        }
        return res;
    }
}
