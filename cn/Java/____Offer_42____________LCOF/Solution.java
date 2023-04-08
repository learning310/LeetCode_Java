// @algorithm @lc id=100304 lang=java
// @title lian-xu-zi-shu-zu-de-zui-da-he-lcof


package ____Offer_42____________LCOF;

import java.util.Arrays;

// @test([-2,1,-3,4,-1,2,1,-5,4])=6
public class Solution { // NOTE: 动态规划
    /**
     * 采用记忆化搜索方法，将问题拆分为连续子数组的和、最大
     * 
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];
        memo[0] = nums[0];
        for (int i = 1; i < n; i++) {
            if (memo[i - 1] <= 0) {
                memo[i] = nums[i];
            } else {
                memo[i] = memo[i - 1] + nums[i];
            }
        }
        return Arrays.stream(memo).max().getAsInt();
    }

    public int maxSubArray1(int[] nums) {
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            res = Math.max(res, nums[i]);
        }

        return res;
    }
}
