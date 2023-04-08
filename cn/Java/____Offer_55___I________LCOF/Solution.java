// @algorithm @lc id=100319 lang=java 
// @title er-cha-shu-de-shen-du-lcof


package ____Offer_55___I________LCOF;
import java.util.LinkedList;
import java.util.Queue;
import algm.*;

// @test([3,9,20,null,null,15,7])=3
public class Solution { // NOTE: 二叉树
    public int maxDepth(TreeNode root) { // levelOrder
        Queue<TreeNode> queue = new LinkedList<>();
        int depth = 0;
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            depth++;
        }
        return depth;
    }
}