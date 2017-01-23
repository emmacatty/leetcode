package com.leetcode.P38;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-10-09
 */
public class C387_FirstUniqueCharInStrTest {

    @Test
    public void testFirstUniqChar() throws Exception {
        C387_FirstUniqueCharInStr c387_firstUniqueCharInStr = new C387_FirstUniqueCharInStr();
        String s1 = "zaabbccw";
        String s2 = "bcdaabcsd";
        String s3 = "bacdabdc";
        assertEquals(0, c387_firstUniqueCharInStr.firstUniqChar(s1));
        assertEquals(7, c387_firstUniqueCharInStr.firstUniqChar(s2));
        assertEquals(-1, c387_firstUniqueCharInStr.firstUniqChar(s3));
    }
}