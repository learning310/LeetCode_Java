// @algorithm @lc id=435 lang=java
// @title non-overlapping-intervals


package _435_Non_overlapping_Intervals;

import java.util.Arrays;

// @test([[1,2],[2,3],[3,4],[1,3]])=1
// @test([[1,2],[1,2],[1,2]])=2
// @test([[1,2],[2,3]])=0
public class Solution { // NOTE: 贪心算法
    /**
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0)
            return 0;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // 按照区间start排序

        int n = intervals.length;
        int[] memo = new int[n];
        Arrays.fill(memo, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (intervals[j][1] <= intervals[i][0]) {
                    memo[i] = Math.max(memo[i], memo[j] + 1);
                }
            }
        }
        
        Arrays.stream(intervals).forEach((item) -> {
            System.out.println(Arrays.toString(item));
        });

        return n - Arrays.stream(memo).max().getAsInt();
    }

}
