// @algorithm @lc id=100335 lang=java
// @title bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof


package ____Offer_65___________LCOF;

public class Solution { // NOTE:
    /**
     * 思路：将单独一位的加法结果表示出来，用不同位运算的结果组合出正确答案
     * 
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        while (b != 0) { // 当c为0时，s=n+c=n
            int c = (a & b) << 1; // c = 进位
            a = a ^ b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;
    }
}
