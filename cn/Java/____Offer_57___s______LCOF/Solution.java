// @algorithm @lc id=100322 lang=java 
// @title he-wei-sde-liang-ge-shu-zi-lcof

package ____Offer_57___s______LCOF;

import java.util.HashSet;
import java.util.Set;

public class Solution { // NOTE: 双指针
    public int[] twoSum1(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(target - nums[i])) {
                return new int[] { nums[i], target - nums[i] };
            }
        }
        return new int[0];
    }

    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[] { nums[left], nums[right] };
            }
        }
        return new int[0];
    }
}