// @algorithm @lc id=100295 lang=java
// @title shu-zhi-de-zheng-shu-ci-fang-lcof

package ____Offer_16_________LCOF;


public class Solution { // 快速幂
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0.0;
        }

        double res = 1.0;
        long m = n;

        if (m < 0) {
            x = 1 / x;
            m = -m;
        }

        while (m > 0) {
            // 奇数
            if (m % 2 == 1) {
                res *= x;
            }
            // 偶数
            x*=x;
            m /= 2;
        }
        return res;
    }
}
