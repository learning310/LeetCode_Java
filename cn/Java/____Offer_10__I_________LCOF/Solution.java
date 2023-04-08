// @algorithm @lc id=100274 lang=java
// @title fei-bo-na-qi-shu-lie-lcof


package ____Offer_10__I_________LCOF;

// @test(5)=5
// @test(45)=134903163
public class Solution { // NOTE: 动态规划
    /**
     * 记忆化搜索
     * 
     * @param n
     * @return
     */
    public int fib(int n) {
        int[] memo = new int[n + 2]; // 多一个元素换来不对n=0时的特殊处理
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 1; i < n; i++) {
            memo[i + 1] = (memo[i] + memo[i - 1]) % 1000000007;
        }
        return memo[n];
    }

    public int fib1(int n) {
        // a -> f[n]
        // b -> f[n+1]
        // sum -> 辅助变量
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
