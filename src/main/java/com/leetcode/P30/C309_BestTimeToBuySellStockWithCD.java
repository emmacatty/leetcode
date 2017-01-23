package com.leetcode.P30;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-15
 */
public class C309_BestTimeToBuySellStockWithCD {
    public int maxProfitOld(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int[][] res = new int[prices.length][3];
        for(int i = 1; i < prices.length; i++) {
            res[i][0] = res[i-1][2];
            for (int j = 0; j < i; j++) {
                res[i][1] = Math.max(res[i][1], res[j][0] + prices[i] - prices[j]);
            }
            res[i][2] = Math.max(res[i-1][1], res[i-1][2]);
        }
        int result = 0;
        for(int i = 0; i < 3; i++) {
            result = Math.max(result, res[prices.length-1][i]);
        }
        return result;
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int len = prices.length;
        int[] sell = new int[len];
        int[] cd = new int[len];
        sell[1] = prices[1]-prices[0];
        for (int i = 2; i < len; i++) {
            sell[i] = prices[i]-prices[i-1] + Math.max(sell[i-1], cd[i-2]);
            cd[i] = Math.max(sell[i-1], cd[i-1]);
        }
        return Math.max(sell[len-1],cd[len-1]);
    }
}
