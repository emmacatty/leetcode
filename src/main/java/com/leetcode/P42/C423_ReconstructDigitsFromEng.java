package com.leetcode.P42;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-01-25
 */
public class C423_ReconstructDigitsFromEng {
    public String originalDigits(String s) {
        int[] res = new int[10];
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)-'a'] += 1;
        }
        res[0] = map['z'-'a'];
        res[2] = map['w'-'a'];
        res[4] = map['u'-'a'];
        res[6] = map['x'-'a'];
        res[8] = map['g'-'a'];
        res[5] = map['f'-'a'] - res[4];
        res[7] = map['v'-'a'] - res[5];
        res[1] = map['o'-'a'] - res[0] - res[2] - res[4];
        res[9] = (map['n'-'a'] -res[7] - res[1])/2;
        res[3] = map['t'-'a'] - res[2] - res[8];
        String ress = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < res[i]; j++) {
                ress += String.valueOf(i);
            }
        }
        return ress;
    }
}
