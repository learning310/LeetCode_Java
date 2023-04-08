// @algorithm @lc id=100316 lang=java 
// @title di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof


package ____Offer_50______________LCOF;

import java.util.HashMap;

// @test("loveleetcode")="v"
public class Solution { // NOTEE: 查找算法
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Boolean> dict = new HashMap<>();
        for (char c : chars) {
            dict.put(c, !dict.containsKey(c));
        }
        for (char c : chars) {
            if (dict.get(c))
                return c;
        }
        return ' ';
    }
}