// @algorithm @lc id=62 lang=java 
// @title unique-paths


package _62_Unique_Paths;


// @test(3,7)=28
// @test(3,2)=3
public class Solution { // NOTE: 动态规划
    /**
     * 走到[i,j]这个位置只能是顶部和左侧过来的，只需将这个地方的可能路径求和即可
     * 
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];

        for (int i = 0; i < m; i++)
            memo[i][0] = 1;

        for (int i = 0; i < n; i++)
            memo[0][i] = 1;

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                memo[i][j] = memo[i - 1][j] + memo[i][j - 1];

        return memo[m - 1][n - 1];
    }
}
