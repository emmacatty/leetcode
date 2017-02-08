package com.leetcode.P10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-08
 */
public class C103_BTZigzagLevelOrderTraversalTest {

    @Test
    public void testZigzagLevelOrder() throws Exception {
        int[] aa = {1,2,3};
        List<Integer> res = new ArrayList<Integer>();
        for (int i : aa) {
            res.add(0, i);
        }
        System.out.println(res);
    }
}