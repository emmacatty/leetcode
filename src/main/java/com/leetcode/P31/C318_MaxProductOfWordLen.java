package com.leetcode.P31;

import java.util.BitSet;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/6/3
 */
public class C318_MaxProductOfWordLen {
    public int maxProduct(String[] words) {
        int[] flags = new int[words.length];
        int[] lens = new int[words.length];
        for (int i = 0; i < words.length; ++i) {
            int flag = 0;
            for (int j = 0; j < words[i].length(); ++j) {
                flag |= 1 << (words[i].charAt(j) - 'a');
            }
            flags[i] = flag;
            lens[i] = words[i].length();
        }
        int ans = 0;
        for (int i = 0; i < flags.length; ++i) {
            for (int j = i + 1; j < flags.length; ++j) {
                if ((flags[i] & flags[j]) == 0) {
                    ans = Math.max(lens[i] * lens[j], ans);
                }
            }
        }
        return ans;
    }

    public int maxProduct2(String[] words) {
        int res = 0;
        for (String word : words) {
            for (String another : words) {
                if (word.equals(another)) {
                    continue;
                }
                if (hasNoCommonLetter(word, another)) {
                    int prod = word.length() * another.length();
                    res = res < prod ? prod : res;
                }
            }
        }
        return res;
    }

    private boolean hasNoCommonLetter(String a, String b) {
        BitSet bsa = new BitSet(26);
        BitSet bsb = new BitSet(26);
        for (int i = 0; i < a.length(); i++) {
            bsa.set(a.charAt(i) - 'a');
        }
        for (int i = 0; i < b.length(); i++) {
            bsb.set(b.charAt(i) - 'a');
        }
        bsa.and(bsb);
        if (bsa.isEmpty()) {
            return true;
        }
        return false;
    }
}
