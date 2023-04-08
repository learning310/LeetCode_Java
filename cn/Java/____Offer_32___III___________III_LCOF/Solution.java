// @algorithm @lc id=100314 lang=java
// @title cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof


package ____Offer_32___III___________III_LCOF;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import algm.*;

// @test([3,9,20,null,null,15,7])=[[3],[20,9],[15,7]]
public class Solution { // NOTE: 二叉树
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        if (root != null)
            queue.add(root);
        boolean isOrderLeft = true;
        while (!queue.isEmpty()) {
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) { // 通过 i 临时记录了一层的节点个数
                TreeNode node = queue.poll();

                if (isOrderLeft) {
                    temp.addLast(node.val); // 头插法
                } else {
                    temp.addFirst(node.val); // 尾插法
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(temp);
            isOrderLeft = !isOrderLeft;
        }
        return res;
    }
}
