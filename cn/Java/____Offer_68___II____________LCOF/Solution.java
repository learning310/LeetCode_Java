// @algorithm @lc id=100347 lang=java 
// @title er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof

package ____Offer_68___II____________LCOF;

import algm.*;

public class Solution { // NOTE: 二叉树
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) { // preOrder
        if (root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // 递归结束条件
        if (left == null && right == null)
            return null; // 1.
        if (left == null)
            return right; // 3.
        if (right == null)
            return left; // 4.
        return root; // 2. if(left != null and right != null)
    }
}