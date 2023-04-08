// @algorithm @lc id=100280 lang=java 
// @title ti-huan-kong-ge-lcof


package ____Offer_05______LCOF;
public class Solution { // NOTE: 字符串
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if ( c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}