// @algorithm @lc id=100341 lang=java 
// @title bu-ke-pai-zhong-de-shun-zi-lcof


package ____Offer_61__________LCOF;

import java.util.HashSet;
import java.util.Set;

public class Solution { // NOTE: 排序
    public boolean isStraight(int[] nums) { // 转换题目条件进行判定
        Set<Integer> set = new HashSet<>();
        int max = 0, min = 14;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            max = Math.max(num, max);
            min = Math.min(num, min);
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return max - min < 5;
    }
}