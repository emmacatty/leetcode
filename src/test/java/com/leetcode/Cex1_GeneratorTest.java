package com.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-10-13
 */
public class Cex1_GeneratorTest {

    @Test
    public void testGenenateArray() throws Exception {
        Cex1_Generator cex1_generator = new Cex1_Generator();
        List<Integer> aa = cex1_generator.genenateArray(1,2,13);
        for (int i : aa) {
            System.out.println(i);
        }
    }
}