package com.leetcode.P39;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-10-09
 */
public class C392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        if (t == null || t.isEmpty()) {
            return false;
        }
        int j = 0;
        int i = 0;
        for (; i < s.length(); i++) {
            if (s.substring(i).equals(t)) {
                return true;
            }
            while (j < t.length() && s.charAt(i) != t.charAt(j)) {
                j++;
            }
            if (j == t.length()) {
                return false;
            }
            if (s.charAt(i) == t.charAt(j)) {
                t = t.substring(j+1);
                j = 0;
            }
        }
        return true;
    }
}
