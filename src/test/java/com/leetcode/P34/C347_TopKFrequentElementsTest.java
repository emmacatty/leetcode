package com.leetcode.P34;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-05-28
 */
public class C347_TopKFrequentElementsTest {

    @Test
    public void testTopKFrequent() throws Exception {
        C347_TopKFrequentElements example = new C347_TopKFrequentElements();
        int[] input = {1,1,1,2,2,3};
        Integer[] eo = {1,2};
        List<Integer> real_output = example.topKFrequent(input, 2);
        Integer[] ro = real_output.toArray(new Integer[real_output.size()]);
        assertArrayEquals(eo, ro);
    }
}