package com.leetcode.P30;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-15
 */
public class C309_BestTimeToBuySellStockWithCD {
    public int maxProfit(int[] prices) {
        int[][] res = new int[prices.length][3];
        for (int i = 1; i < prices.length; i++) {
            res[i][0] = res[i-1][2];
            for (int j = 0; j <=i; j++) {
                res[i][1] = Math.max(res[i][1], res[j])
        }
    }
}
