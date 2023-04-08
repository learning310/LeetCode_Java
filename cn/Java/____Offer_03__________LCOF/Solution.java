// @algorithm @lc id=100275 lang=java 
// @title shu-zu-zhong-zhong-fu-de-shu-zi-lcof


package ____Offer_03__________LCOF;

import java.util.HashSet;
import java.util.Set;

// @test([2,3,1,0,2,5,3])=2
public class Solution { // NOTE: 查找算法
    /**
     * 利用集合元素不可重复特点
     * 
     * @param nums
     * @return
     */
    public int findRepeatNumber1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return num;
            set.add(num);
        }
        return -1;
    }

    /**
     * 题目中存在条件：数组长度和数据范围；故可以利用该条件
     * 
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        int index = 0;
        while (index < nums.length) {
            if (nums[index] == index) {
                index++;
                continue;
            }
            // 因为重复发生错位
            if (nums[nums[index]] == nums[index]) {
                return nums[index];
            }
            // 纠正错位
            int temp = nums[index];
            nums[index] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }
}
