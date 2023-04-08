// @algorithm @lc id=64 lang=java 
// @title minimum-path-sum


package _64_Minimum_Path_Sum;


// @test([[1,3,1],[1,5,1],[4,2,1]])=7
// @test([[1,2,3],[4,5,6]])=12
public class Solution { // NOTE: 动态规划

    /**
     * 走到[i,j]这个位置只能是顶部和左侧过来的，只需判定顶部和左侧哪条路最短
     * 
     * @param grid
     * @return
     */
    public int minPathSum1(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 1; i < row; i++)
            grid[i][0] = grid[i - 1][0] + grid[i][0];

        for (int i = 1; i < col; i++)
            grid[0][i] = grid[0][i - 1] + grid[0][i];

        for (int i = 1; i < row; i++)
            for (int j = 1; j < col; j++)
                grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];

        return grid[row - 1][col - 1];
    }

    /**
     * 相当于记忆化搜索
     * 
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[] memo = new int[col];

        for (int i = 1; i < memo.length; i++)
            memo[i] = Integer.MAX_VALUE; // 等待正确值对其刷新

        for (int i = 0; i < row; i++) {
            memo[0] += grid[i][0]; // 第0列只能从顶部下来
            for (int j = 1; j < col; j++)
                memo[j] = Math.min(memo[j], memo[j - 1]) + grid[i][j];
        }

        return memo[col - 1];
    }
}
