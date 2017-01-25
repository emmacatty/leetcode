package com.leetcode.P42;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-01-25
 */
public class C423_ReconstructDigitsFromEngTest {
    C423_ReconstructDigitsFromEng c423_reconstructDigitsFromEng = new C423_ReconstructDigitsFromEng();
    @Test
    public void testOriginalDigits() throws Exception {
        assertEquals("7", c423_reconstructDigitsFromEng.originalDigits("esnve"));
    }
}