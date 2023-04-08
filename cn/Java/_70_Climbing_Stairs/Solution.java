// @algorithm @lc id=70 lang=java 
// @title climbing-stairs


package _70_Climbing_Stairs;

// @test(2)=2
// @test(3)=3
public class Solution { // NOTE: 动态规划
    /**
     * 标准递推式
     * 
     * @param n
     * @return
     */
    public int climbStairs1(int n) {
        if (n == 1)
            return n;

        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        for (int i = 3; i < n + 1; i++)
            memo[i] = memo[i - 1] + memo[i - 2];
        return memo[n];
    }

    public int climbStairs(int n) {
        int f1 = 0, f2 = 0; // f1 = f(n-1), f2 = f(n-2)
        int fn = 1; 
        for (int i = 1; i <= n; i++) {
            f2 = f1;
            f1 = fn;
            fn = f1 + f2;
        }
        return fn;
    }
}
