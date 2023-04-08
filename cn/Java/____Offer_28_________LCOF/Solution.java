// @algorithm @lc id=100289 lang=java
// @title dui-cheng-de-er-cha-shu-lcof


package ____Offer_28_________LCOF;


import algm.*;

// @test([1,2,2,3,null,null,3])=true
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }

    boolean recur(TreeNode L, TreeNode R) {
        // 同时为空
        if (L == null && R == null) {
            return true;
        }
        // 一个为空，且值不相等
        if (L == null || R == null || L.val != R.val) { // 利用短路原则避免了空指针访问
            return false;
        }
        // 均不为空，且值相等
        return recur(L.left, R.right) && recur(L.right, R.left); 
    }
}
