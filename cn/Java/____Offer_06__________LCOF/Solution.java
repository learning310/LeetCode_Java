// @algorithm @lc id=100282 lang=java 
// @title cong-wei-dao-tou-da-yin-lian-biao-lcof

package ____Offer_06__________LCOF;

import java.util.ArrayList;
import java.util.Stack;

import algm.*;

// @test([1,3,2])=[2,3,1]
public class Solution { // NOTE: 链表
    ArrayList<Integer> list = new ArrayList<Integer>();

    /**
     * （循环实现）遍历链表，利用栈的特点实现反转效果
     * 
     * @param head
     * @return
     */
    public int[] reversePrint1(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = stack.pop();
        return res;
    }

    /**
     * 递归调用实现
     * 
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++)
            res[i] = list.get(i);
        return res;
    }

    void recur(ListNode head) {
        if (head == null)
            return;
        recur(head.next);
        list.add(head.val);
    }
}
