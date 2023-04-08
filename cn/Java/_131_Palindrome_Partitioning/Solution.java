// @algorithm @lc id=131 lang=java 
// @title palindrome-partitioning


package _131_Palindrome_Partitioning;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// @test("aab")=[["a","a","b"],["aa","b"]]
// @test("a")=[["a"]]
// @test("abccba")=[["a","b","c","c","b","a"],["a","b","cc","b","a"],["a","bccb","a"],["abccba"]]
public class Solution { // NOTE: 回溯法
    List<List<String>> res = new ArrayList<>();
    Deque<String> queue = new ArrayDeque<>();

    public List<List<String>> partition(String s) {
        if (s.length() == 0) 
            return res;
        char[] charArray = s.toCharArray();
        dfs(charArray, 0, s.length());
        return res;
    }

    /**
     * 
     * @param charArray
     * @param index 当前处理的索引(不确定是否构成回文的开始位置)
     * @param len 字符数组长度
     */
    private void dfs(char[] charArray, int index, int len) {
        System.out.println(index);

        if (index == len) {
            res.add(new ArrayList<>(queue));
            return;
        }

        for (int i = index; i < len; i++) { // 以index作为起点，省去了重头调用（dp）
            if (!checkPalindrome(charArray, index, i)) 
                continue;
            queue.addLast(new String(charArray, index, i + 1 - index)); // 最后的参数是长度，不是索引
            dfs(charArray, i + 1, len);
            queue.removeLast();
        }
    }

    /**
     * 由left和right构成子串的闭区间，判断一个子串是否是回文子串（因为截取字符串是消耗性能的，故采用传子串下标的方式）
     * 
     * @param charArray
     * @param left 子串的左边界
     * @param right 子串的右边界
     * @return
     */
    private boolean checkPalindrome(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) 
                return false;
            left++;
            right--;
        }
        return true;
    }
}
