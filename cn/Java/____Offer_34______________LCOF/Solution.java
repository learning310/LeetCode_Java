// @algorithm @lc id=100317 lang=java
// @title er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof


package ____Offer_34______________LCOF;

import java.util.LinkedList;
import java.util.List;
import algm.*;

// @test([5,4,8,11,null,13,4,7,2,null,null,5,1],22)=[[5,4,11,2],[5,8,4,5]]
// @test([1,2],1)=[]
public class Solution { // NOTE: 搜索算法
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        dfs(root, target);
        return res;
    }

    void dfs(TreeNode root, int target) {
        if (root == null) {
            return;
        }

        target -= root.val;
        list.addLast(root.val);
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(list));
        }

        dfs(root.left, target);
        dfs(root.right, target);

        list.removeLast();
    }
}
