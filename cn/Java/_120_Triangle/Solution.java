// @algorithm @lc id=120 lang=java
// @title triangle


package _120_Triangle;

import java.util.List;

// @test([[2],[3,4],[6,5,7],[4,1,8,3]])=11
// @test([[-10]])=-10
public class Solution { // NOTE: 动态规划
    /**
     * 自顶向下难以确定选择哪条路，而自顶向上可以确定正确的落点是在某个元素上的
     * 
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int[] memo = new int[row + 1];

        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                memo[j] = Math.min(memo[j], memo[j + 1]) + triangle.get(i).get(j);
            }
        }

        return memo[0];
    }
}
