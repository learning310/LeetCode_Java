// @algorithm @lc id=100345 lang=java 
// @title qiu-12n-lcof

package ____Offer_64__1_2___n_LCOF;

public class Solution { // 递归
    int res;

    public int sumNums(int n) {
        boolean x = n > 1 && sumNums(n - 1) > 0; // 利用短路效应结束递归
        res += n;
        return res;
    }
}