package com.leetcode.P31;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-12
 */
public class C312_BurstBalloonsTest {

    @Test
    public void testMaxCoins() throws Exception {
        C312_BurstBalloons example = new C312_BurstBalloons();
     //   int[] input = {7,9,8,0,7,1,3,5,5,2,3,3};
        int[] input2 = {3,1,5,8};
        System.out.println(example.maxCoins(input2));
    }
}