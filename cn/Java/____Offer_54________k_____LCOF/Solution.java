// @algorithm @lc id=100333 lang=java
// @title er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof


package ____Offer_54________k_____LCOF;

import java.util.ArrayList;
import java.util.List;
import algm.*;

// @test([3,1,4,null,2], 1)=4
public class Solution { // NOTE: 搜索算法
    List<Integer> list = new ArrayList<>();

    int k, res;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        inOrder(root);
        return res;
    }

    void inOrder(TreeNode root) { // 倒序中序遍历
        if (root == null) {
            return;
        }

        inOrder(root.right);

        k--;
        if (k == 0) {
            res = root.val;
            return;
        }

        inOrder(root.left);
    }

    public int kthLargest1(TreeNode root, int k) {
        inOrder1(root);
        return list.get(list.size() - k);
    }

    void inOrder1(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder1(root.left);

        list.add(root.val);

        inOrder1(root.right);
    }
}
