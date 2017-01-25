package com.leetcode.P48;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-01-25
 */
public class C486_PredictWinnerTest {
    C486_PredictWinner c486_predictWinner = new C486_PredictWinner();
    @Test
    public void testPredictTheWinner() throws Exception {
       assertFalse(c486_predictWinner.PredictTheWinner(new int[]{1, 5, 2}));
      assertTrue(c486_predictWinner.PredictTheWinner(new int[]{1,5,233,7}));
    }
}