// @algorithm @lc id=100292 lang=java
// @title er-jin-zhi-zhong-1de-ge-shu-lcof


package ____Offer_15_____1____LCOF;


public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt += n & 1;
            n >>>= 1;
        }
        return cnt;
    }

    public int hammingWeight2(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= n - 1; // 消除最右边的1
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 0b00000000000000000000000000001011;
        solution.hammingWeight(x);
    }
}
