// @algorithm @lc id=91 lang=java
// @title decode-ways

package _91_Decode_Ways;

// @test("12")=2
// @test("226")=3
// @test("06")=0
// @test("10")=1
// @test("0")=0
public class Solution { // NOTE: 动态规划
    /**
     * 简化版（直接理解较难，从用变量替代数组的角度好懂一些
     * 
     * @param s
     * @return
     */
    public int numDecodings1(String s) {
        char[] chars = s.toCharArray();

        // 0开头的情况
        if (chars[0] == '0')
            return 0;

        // pre -> ; cur ->
        int pre = 1, cur = 1;
        for (int i = 1; i < chars.length; i++) {
            int tmp = cur;
            if (chars[i] == '0') {
                if (chars[i - 1] == '1' || chars[i - 1] == '2') // {10, 20}
                    cur = pre; // chars[i, i-1] -> 一种解码可能
                else
                    return 0; // 无效输入
            } else if (chars[i - 1] == '1'
                    || (chars[i - 1] == '2' && chars[i] >= '1' && chars[i] <= '6')) { // [11, 26]
                cur = cur + pre; // chars[i, i-1] -> 两种解码可能
            }
            pre = tmp;
        }

        return cur;
    }

    /**
     * 
     * @param s
     * @return
     */
    public int numDecodings2(String s) {
        char[] chars = s.toCharArray();

        // 0开头的情况
        if (chars[0] == '0')
            return 0;

        int[] memo = new int[chars.length + 1];
        memo[0] = memo[1] = 1; // memo[-1] = memo[0] = 1
        for (int i = 1, j = 2; i < chars.length; i++, j++) {
            if (chars[i] == '0') {
                if (chars[i - 1] == '1' || chars[i - 1] == '2')
                    memo[j] = memo[j - 2];
                else
                    return 0;
            } else if (chars[i - 1] == '1'
                    || (chars[i - 1] == '2' && chars[i] >= '1' && chars[i] <= '6')) {
                memo[j] = memo[j - 1] + memo[j - 2];
            } else {
                memo[j] = memo[j - 1]; // FIXME: 这是什么情况
            }
        }
        return memo[chars.length];
    }
    
    public int numDecodings(String s) {
        int n = s.length();
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; ++i) {
            if (s.charAt(i - 1) != '0') {
                f[i] = f[i - 1]; // f[i] = f[i-1] (使用一个字符编码)
            }
            if (i > 1 && s.charAt(i - 2) != '0'
                    && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                f[i] = f[i] + f[i - 2]; // f[i] (使用一个字符编码) + f[i-2] (使用两个字符编码)
            }
        }
        return f[n];
    }
}
