// @algorithm @lc id=392 lang=java 
// @title is-subsequence


package _392_Is_Subsequence;
// @test("abc","ahbgdc")=true
// @test("axc","ahbgdc")=false
public class Solution { // NOTE: 贪心算法
    public boolean isSubsequence(String s, String t) {
        int si = 0, ti = 0;
        while (si < s.length() && ti < t.length()) {
            if (s.charAt(si) == t.charAt(ti)) {
                si++;
                ti++;
            } else {
                ti++;
            }
        }
        if (si == s.length()) {
            return true;
        } else {
            return false;
        }
    }
}