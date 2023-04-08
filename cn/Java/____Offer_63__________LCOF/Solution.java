// @algorithm @lc id=100344 lang=java
// @title gu-piao-de-zui-da-li-run-lcof


package ____Offer_63__________LCOF;

// @test([7,1,5,3,6,4])=5
// @test([7,6,4,3,1])=0
public class Solution { // NOTE: 动态规划

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] memo = new int[n + 1]; // 通过增加一个元素和改变迭代方式使得省略对n=0的特殊处理
        memo[0] = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, prices[i]);
            memo[i + 1] = Math.max(memo[i], prices[i] - min);
        }
        return memo[n];
    }


    /**
     * 题目如果升级一下，买入之后只能隔天卖出，那么如何解决
     * 
     * @param prices
     * @return
     */
    public int maxProfit1(int[] prices) {
        int take = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            // 首先更新买入价格，确保买入为历史最低
            take = Math.min(take, price);
            profit = Math.max(profit, price - take);
        }
        return profit;
    }
}
