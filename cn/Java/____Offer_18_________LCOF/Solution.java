// @algorithm @lc id=100299 lang=java
// @title shan-chu-lian-biao-de-jie-dian-lcof


package ____Offer_18_________LCOF;

import algm.*;

// @test([4,5,1,9],4)=[5,1,9]
public class Solution { // NOTE: 双指针
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val)
            return head.next;
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val) { // 找到后立即结束循环
            pre = cur;
            cur = cur.next;
        }
        if (cur != null)
            pre.next = cur.next;
        return head;
    }
}
