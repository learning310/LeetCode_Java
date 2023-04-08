// @algorithm @lc id=63 lang=java 
// @title unique-paths-ii


package _63_Unique_Paths_II;

// @test([[0,0,0],[0,1,0],[0,0,0]])=2
// @test([[0,1],[0,0]])=1
// @test([[0],[0]])=1
public class Solution { // NOTE: 动态规划
    /**
     * 
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] memo = new int[row][col];

        // 如果在边界上存在障碍物，其后的路都是挡死的
        for (int i = 0; i < row && obstacleGrid[i][0] == 0; i++)
            memo[i][0] = 1;
        for (int i = 0; i < col && obstacleGrid[0][i] == 0; i++)
            memo[0][i] = 1;

        for (int i = 1; i < row; i++)
            for (int j = 1; j < col; j++)
                if (obstacleGrid[i][j] == 0)
                    memo[i][j] = memo[i - 1][j] + memo[i][j - 1];

        return memo[row - 1][col - 1];
    }
}
