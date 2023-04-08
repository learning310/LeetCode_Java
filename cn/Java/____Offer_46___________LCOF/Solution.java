// @algorithm @lc id=100325 lang=java
// @title ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof


package ____Offer_46___________LCOF;

// @test(26)=1
// @test(506)=1
// @test(25)=2
// @test(220)=3
public class Solution { // NOTE: 动态规划
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int n = String.valueOf(num).length();

        int[] memo = new int[n + 1];
        memo[0] = 1; // 初始条件
        for (int i = 1; i <= n; i++) { // memo[i - 1] -> 当前字符
            memo[i] = memo[i - 1];
            if (i > 1 && (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') >= 10
                    && (s.charAt(i - 2) - '0') * 10 + (s.charAt(i-1) - '0') <= 25) {
                memo[i] = memo[i] + memo[i - 2];
            }
        }
        return memo[n];
    }
}
