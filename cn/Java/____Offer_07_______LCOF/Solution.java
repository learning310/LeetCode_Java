// @algorithm @lc id=100283 lang=java
// @title zhong-jian-er-cha-shu-lcof

package ____Offer_07_______LCOF;

import java.util.HashMap;

import algm.*;

// @test([3,9,20,15,7], [9,3,15,20,7])=[3,9,20,null,null,15,7]
public class Solution { // NOTE: 分治算法
    int[] preorder;
    HashMap<Integer, Integer> dic = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }

    TreeNode recur(int root, int left, int right) {
        if (left > right) {
            return null;
        }
        // 建立根节点
        TreeNode node = new TreeNode(preorder[root]);
        // 获取起点
        int index = dic.get(preorder[root]);
        // 左子树递归
        node.left = recur(root + 1, left, index - 1);
        // 右子树递归
        node.right = recur(root + index - left + 1, index + 1, right); // 因为root和index重复了包涵了遍历过的left的范围
        return node;
    }

}
