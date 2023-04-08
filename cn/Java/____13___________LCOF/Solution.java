// @algorithm @lc id=100281 lang=java
// @title ji-qi-ren-de-yun-dong-fan-wei-lcof


package ____13___________LCOF;

import java.util.LinkedList;
import java.util.Queue;

// @test(2,3,1)=3
// @test(16,8,4)=15
// @test(11,8,16)=88
public class Solution { // NOTE: 搜索算法
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0, 0, 0});
        while (queue.size() > 0) {
            int[] x = queue.poll();
            int i = x[0], j = x[1], si = x[2], sj = x[3];
            if (i >= m || j >= n || k < si + sj || visited[i][j]) {
                continue;
            }
            visited[i][j] = true;
            count++;
            queue.add(new int[] {i + 1, j, helper(i + 1), sj});
            queue.add(new int[] {i, j + 1, si, helper(j + 1)});
        }
        return count;
    }

    int helper(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x = x / 10;
        }
        return res;
    }
}
