package com.leetcode.P38;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-10-10
 */
public class C384_ShuffileArrayTest {

    @Test
    public void testReset() throws Exception {
        int[] arr = {1,2,3};
        C384_ShuffileArray c384_shuffileArray = new C384_ShuffileArray(arr);
        int[] resetArr = c384_shuffileArray.reset();
        int[] shuffleArr = c384_shuffileArray.shuffle();

        printArray(resetArr);
        printArray(shuffleArr);
    }

    private void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}