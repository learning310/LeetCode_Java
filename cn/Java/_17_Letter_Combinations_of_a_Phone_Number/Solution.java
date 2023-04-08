// @algorithm @lc id=17 lang=java 
// @title letter-combinations-of-a-phone-number

package _17_Letter_Combinations_of_a_Phone_Number;

import java.util.ArrayList;
import java.util.List;

// @test("23")=["ad","ae","af","bd","be","bf","cd","ce","cf"]
// @test("")=[]
// @test("2")=["a","b","c"]
public class Solution { // NOTE: 回溯法
    private List<String> res = new ArrayList<>();

    private String[] letterMap =
            {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz",};

    public List<String> letterCombinations(String digits) {
        if (digits.length() > 0) 
            dfs(digits, 0, "");
        return res;
    }

    /**
     * 
     * @param digits 整体字符串
     * @param index 当前处理到的索引（之前的已经处理完）
     * @param s 当前位置之前的所有字符串总和
     */
    void dfs(String digits, int index, String s) {
        if (index == digits.length()) {
            res.add(s);
            return;
        }

        char c = digits.charAt(index);
        assert (c >= '0' && c <= '9' && c != '1');
        
        // 枚举每一种可能性并递归
        String letters = letterMap[c - '0'];
        for (int i = 0; i < letters.length(); i++) {
            dfs(digits, index + 1, s + letters.charAt(i));
        }
    }
}
