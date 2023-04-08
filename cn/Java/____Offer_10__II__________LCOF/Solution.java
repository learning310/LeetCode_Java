// @algorithm @lc id=100277 lang=java
// @title qing-wa-tiao-tai-jie-wen-ti-lcof


package ____Offer_10__II__________LCOF;

public class Solution { // NOTE: 动态规划
    public int numWays(int n) {
        int[] memo = new int[n + 2]; // 多一个元素换来不对n=0时的特殊处理
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 1; i < n; i++) {
            memo[i + 1] = (memo[i] + memo[i - 1]) % 1000000007;
        }
        return memo[n];
    }

    public int numWays1(int n) {
        int a = 1, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
