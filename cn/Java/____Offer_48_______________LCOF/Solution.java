// @algorithm @lc id=100332 lang=java
// @title zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof


package ____Offer_48_______________LCOF;

import java.util.HashMap;
import java.util.Map;


// @test("abcabcbb")=3
// @test("dvdf")=3
// @test("abba")=2
public class Solution { // NOTE: 动态规划
    public int lengthOfLongestSubstring1(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        int res = 0, dp = 0;
        for (int j = 0; j < s.length(); j++) { // 右边界 j
            int i = dict.getOrDefault(s.charAt(j), -1); // 获取左边界 i
            dict.put(s.charAt(j), j);
            if (dp < j - i) {
                dp = dp + 1; // dp[j] = dp[j - 1] + 1
            } else {
                dp = j - i; // dp[j] = j - i
            }
            res = Math.max(res, dp); // 全局最大值
        }
        return res;
    }

    public int lengthOfLongestSubstring(String s) { // NOTE: 双指针
        Map<Character, Integer> dict = new HashMap<>();
        int left = -1, res = 0;
        for (int right = 0; right < s.length(); right++) {
            if (dict.containsKey(s.charAt(right))) {
                left = Math.max(left, dict.get(s.charAt(right))); // 更新左指针
            }
            dict.put(s.charAt(right), right);
            res = Math.max(res, right - left);
        }
        return res;
    }
}
