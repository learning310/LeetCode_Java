// @algorithm @lc id=100323 lang=java
// @title ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof


package ____Offer_45___________LCOF;

import java.util.Arrays;

// @test([10,2])="102"
// @test([3,30,34,5,9])="3033459"
public class Solution { // NOTE: 排序
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x)); // 因为String实现了Comparable接口

        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s);
        }
        return res.toString();
    }
}
