// @algorithm @lc id=100288 lang=java 
// @title er-cha-shu-de-jing-xiang-lcof


package ____Offer_27_________LCOF;
import algm.*;

// @test([4,2,7,1,3,6,9])=[4,7,2,9,6,3,1]
public class Solution { // NOTE: 二叉树
    public TreeNode mirrorTree(TreeNode root) {
        postOrder(root);
        return root;
    }

    void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}