package com.leetcode.P31;

import java.util.*;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/6/3
 */
public class C318_MaxProductOfWordLen {
    class comp implements Comparator<String> {
        public int compare(String o1, String o2) {
            return Integer.compare(o2.length(), o1.length());
        }
    }

    public int maxProduct(String[] words) {
        Arrays.sort(words, new comp());
        int[] flags = new int[words.length];
        int[] lens = new int[words.length];
        Set<Integer> keys = new HashSet<Integer>();
        int shrink = 0;
        for (int i = 0; i < words.length; ++i) {
            int flag = 0;
            for (int j = 0; j < words[i].length(); ++j) {
                flag |= 1 << (words[i].charAt(j) - 'a');
            }
            flags[shrink] = flag;
            lens[shrink++] = words[i].length();
            keys.add(flag);
        }
        int ans = 0;
        for (int i = 0; i < shrink; ++i) {
            for (int j = i + 1; j < shrink; ++j) {
                if ((flags[i] & flags[j]) == 0) {
                    ans = Math.max(lens[i] * lens[j], ans);
                }
            }
        }
        return ans;
    }

    public int maxProduct2(String[] words) {
        int res = 0;
        Map<Integer, Integer> bit2len = new HashMap<Integer, Integer>();
        for (String word : words) {
            int flag = 0;
            int wordLen = word.length();
            for (int j = 0; j < wordLen; j++) {
                flag |= 1 << (word.charAt(j) - 'a');
            }
            if (bit2len.containsKey(flag)) {
                int len = bit2len.get(flag);
                if (len < wordLen) {
                    bit2len.put(flag, wordLen);
                }
            } else {
                bit2len.put(flag, wordLen);
            }
        }
//        for (bit2len.)
        return 0;
    }

    public int maxProduct3(String[] words) {
        int res = 0;
        Map<BitSet, Integer> bit2len = new HashMap<BitSet, Integer>();
        for (String word : words) {
            BitSet bs = new BitSet(26);
            for (int i = 0; i < word.length(); i++) {
                bs.set(word.charAt(i) - 'a');
            }
            if (bit2len.containsKey(bs)) {
                int len = bit2len.get(bs);
                if (word.length() > len) {
                    bit2len.put(bs, word.length());
                }
            } else {
                bit2len.put(bs, word.length());
            }
        }

        for (Map.Entry<BitSet, Integer> entry : bit2len.entrySet()) {
            for (Map.Entry<BitSet, Integer> another : bit2len.entrySet()) {
                if (!entry.getKey().intersects(another.getKey())) {
                    int prod = entry.getValue() * another.getValue();
                    res = res < prod ? prod : res;
                }
            }
        }
        return res;
    }
}



