package com.leetcode.P33;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-21
 */
public class C331_VerifyPreorderSerializationOfBTTest {

    @Test
    public void testIsValidSerialization() throws Exception {
        C331_VerifyPreorderSerializationOfBT example = new C331_VerifyPreorderSerializationOfBT();
        String input1 = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        String input2 = "1, #";
        assertTrue(example.isValidSerialization(input1));
        assertFalse(example.isValidSerialization(input2));
    }
}