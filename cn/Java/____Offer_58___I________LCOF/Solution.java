// @algorithm @lc id=100328 lang=java
// @title fan-zhuan-dan-ci-shun-xu-lcof


package ____Offer_58___I________LCOF;


// @test(" hello world! ")="world! hello"
public class Solution { // NOTE: 双指针
    public String reverseWords(String s) {
        String[] strs = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].equals(""))
                continue;
            res.append(strs[i] + " ");
        }
        return res.toString().trim();
    }
}
