// @algorithm @lc id=100312 lang=java
// @title cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof


package ____Offer_32___II___________II_LCOF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import algm.*;

// @test([3,9,20,null,null,15,7])=[[3],[9,20],[15,7]]
public class Solution { // NOTE: 二叉树
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) { // 通过 i 临时记录了一层的节点个数
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            res.add(temp);
        }
        return res;
    }
}
