package com.leetcode.P40;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-01-24
 */
public class C401_BinaryWatchTest {
    C401_BinaryWatch c401_binaryWatch = new C401_BinaryWatch();
    @Test
    public void testReadBinaryWatch() throws Exception {
        List<String> res = c401_binaryWatch.readBinaryWatch(2);
        System.out.println(res);
    }
}