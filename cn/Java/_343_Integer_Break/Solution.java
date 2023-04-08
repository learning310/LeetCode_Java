// @algorithm @lc id=343 lang=java
// @title integer-break


package _343_Integer_Break;

import java.util.Arrays;

// @test(2)=1
// @test(10)=36
public class Solution { // NOTE: 动态规划
    /**
     * 
     * @param n
     * @return
     */
    public int integerBreak(int n) {
        int[] memo = new int[n + 1]; // 可以拆分得到的最大乘积
        Arrays.fill(memo, -1);
        memo[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                memo[i] = max3(memo[i], j * (i - j), j * memo[i - j]);
            }
        }

        return memo[n];
    }

    int max3(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
