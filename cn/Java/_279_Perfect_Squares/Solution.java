// @algorithm @lc id=279 lang=java
// @title perfect-squares


package _279_Perfect_Squares;

// @test(12)=3
// @test(13)=2
public class Solution { // NOTE: 贪心算法
    /**
     * 
     * @param n
     * @return
     */
    public int numSquares(int n) {
        int[] memo = new int[n + 1]; // 记录可以拆分多少个完全平方数
        
        for (int i = 1; i <= n; i++) {
            int minium = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minium = Math.min(minium, memo[i - j * j]);
            }
            memo[i] = minium + 1;
        }
        return memo[n];
    }

}
