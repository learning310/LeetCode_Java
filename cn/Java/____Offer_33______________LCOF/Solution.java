// @algorithm @lc id=100315 lang=java 
// @title er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof

package ____Offer_33______________LCOF;

// @test([4,8,6,12,16,14,10])=true
public class Solution { // NOTE: 分治算法
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    boolean recur(int[] postorder, int i, int j) {
        if (i >= j)
            return true;
        int p = i;
        while (postorder[p] < postorder[j])
            p++;
        int m = p;
        while (postorder[p] > postorder[j])
            p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }

}