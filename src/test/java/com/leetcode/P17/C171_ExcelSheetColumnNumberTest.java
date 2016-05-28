package com.leetcode.P17;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-05-15
 */
public class C171_ExcelSheetColumnNumberTest {

    @Test
    public void testTitleToNumber() throws Exception {
        C171_ExcelSheetColumnNumber example = new C171_ExcelSheetColumnNumber();
        assertEquals(28, example.titleToNumber("AB"));
        assertEquals(1, example.titleToNumber("A"));
    }
}