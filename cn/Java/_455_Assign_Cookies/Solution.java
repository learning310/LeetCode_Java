// @algorithm @lc id=455 lang=java
// @title assign-cookies


package _455_Assign_Cookies;

import java.util.Arrays;

// @test([1,2,3],[1,1])=1
// @test([1,2],[1,2,3])=2
public class Solution { // NOTE: 贪心算法
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int si = 0, gi = 0;
        int res = 0;

        while (si < s.length && gi < g.length) {
            if (g[gi] <= s[si]) {
                res++;
                si++;
                gi++;
            } else {
                gi++;
            }
        }

        return res;
    }
}
