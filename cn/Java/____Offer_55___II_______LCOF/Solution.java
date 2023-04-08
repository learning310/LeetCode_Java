// @algorithm @lc id=100342 lang=java
// @title ping-heng-er-cha-shu-lcof


package ____Offer_55___II_______LCOF;

import algm.*;

// @test([3,9,20,null,null,15,7])=true
// @test([1,2,2,3,3,null,null,4,4])=false
// @test([1,2,2,3,null,null,3,4,null,null,4])=false
public class Solution { // NOTE: 二叉树
    public boolean isBalanced(TreeNode root) {
        return postOrder(root) != -1;
    }

    private int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = postOrder(root.left);
        if (left == -1) {
            return -1;
        }
        int right = postOrder(root.right);
        if (right == -1) {
            return -1;
        }
        if (Math.abs(left - right) < 2) {
            return Math.max(left, right) + 1; // 返回树高
        } else {
            return -1;
        }
    }
}
