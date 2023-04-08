// @algorithm @lc id=100287 lang=java
// @title shu-de-zi-jie-gou-lcof


package ____Offer_26________LCOF;

import algm.*;

// @test([1,2,3,4], [3])=true
public class Solution { // NOTE: 二叉树
    // 题目中指定判断B是不是A的子结构，并不是随意的
    public boolean isSubStructure(TreeNode A, TreeNode B) { // preOrder
        if (A == null || B == null) { // 空树不是任何一个树的子结构
            return false;
        }

        return recur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    /**
     * 判定B是否是A的子结构
     * @param A
     * @param B
     * @return
     */
    boolean recur(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null || A.val != B.val) {
            return false;
        }
        return recur(A.left, B.left)  && recur(A.right, B.right);
    }
}
