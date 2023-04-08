// @algorithm @lc id=93 lang=java 
// @title restore-ip-addresses


package _93_Restore_IP_Addresses;

import java.util.ArrayList;
import java.util.List;

// @test("25525511135")=["255.255.11.135","255.255.111.35"]
// @test("0000")=["0.0.0.0"]
// @test("101023")=["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
public class Solution { // NOTE: 回溯法
    List<String> res = new ArrayList<>();
    static final int MAX = 255;
    static final int SEG_COUNT = 4;
    int[] segments = new int[SEG_COUNT];

    public List<String> restoreIpAddresses(String s) {
        dfs(s, 0, 0);
        return res;
    }

    /**
     * 
     * @param s 整体字符串
     * @param segIndex 当前处理的ip段索引
     * @param index 当前处理的字符串索引
     */
    private void dfs(String s, int segIndex, int index) {
        if (segIndex == SEG_COUNT) {
            if (index == s.length()) {
                // 如果找到了 4 段 IP 地址并且遍历完了字符串，那么就是一种答案
                StringBuffer ipAddr = new StringBuffer();
                for (int i = 0; i < SEG_COUNT; ++i) {
                    ipAddr.append(segments[i]);
                    if (i != SEG_COUNT - 1) {
                        ipAddr.append('.');
                    }
                }
                res.add(ipAddr.toString());
                return; // 正确答案返回
            }
            return; //（错误情况1）IP段以及填满但还有剩余字符串
        }

        if (index == s.length()) 
            return; // （错误情况2）还没有填满IP段就已经遍历完了字符串

        // 由于不能有前导零，如果当前数字为 0，那么这一段 IP 地址只能为 0
        if (s.charAt(index) == '0') {
            segments[segIndex] = 0;
            dfs(s, segIndex + 1, index + 1);
        }

        // （一般情况）枚举每一种可能性并递归
        int addr = 0;
        for (int i = index; i < s.length(); ++i) {
            addr = addr * 10 + (s.charAt(i) - '0');
            if (addr > 0 && addr <= MAX) {
                segments[segIndex] = addr; // 当前IP段的值
                dfs(s, segIndex + 1, i + 1);
            } else {
                break;
            }
        }

    }
}
