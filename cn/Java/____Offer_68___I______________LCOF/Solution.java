// @algorithm @lc id=100346 lang=java 
// @title er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof

package ____Offer_68___I______________LCOF;

import algm.*;

public class Solution { // NOTE: 二叉树
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) { // preOrder
        if (p.val <= root.val && q.val >= root.val) {
            return root;
        }

        if (p.val >= root.val && q.val <= root.val) {
            return root;
        }

        if (p.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return lowestCommonAncestor(root.right, p, q);
        }
    }
}