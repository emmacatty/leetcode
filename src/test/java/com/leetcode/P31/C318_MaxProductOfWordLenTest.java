package com.leetcode.P31;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/6/3
 */
public class C318_MaxProductOfWordLenTest {
    @Test
    public void maxProduct() throws Exception {
        C318_MaxProductOfWordLen example = new C318_MaxProductOfWordLen();
        String[] input1 = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        String[] input2 = {"a", "aa", "aaaa"};
        assertEquals(16, example.maxProduct(input1));
        assertEquals(0, example.maxProduct(input2));
    }

}