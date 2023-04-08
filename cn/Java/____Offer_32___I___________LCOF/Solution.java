// @algorithm @lc id=100311 lang=java
// @title cong-shang-dao-xia-da-yin-er-cha-shu-lcof


package ____Offer_32___I___________LCOF;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import algm.*;

// @test([3,9,20,null,null,15,7])=[3,9,20,15,7]
// @test([])=[]
// @test([1,2,3,4,5])=[1,2,3,4,5]
public class Solution { // NOTE: 二叉树
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        TreeNode p = null;
        while (!queue.isEmpty()) {
            p = queue.poll();
            list.add(p.val);
            if (p.left != null) {
                queue.add(p.left);
            }
            if (p.right != null) {
                queue.add(p.right);
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

}
