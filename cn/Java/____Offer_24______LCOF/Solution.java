// @algorithm @lc id=100298 lang=java 
// @title fan-zhuan-lian-biao-lcof


package ____Offer_24______LCOF;

import algm.*;

/* public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
} */


// @test([1,2,3,4,5])=[5,4,3,2,1]
public class Solution { // NOTE: 链表
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode after = null;
        while (curr != null) {
            after = curr.next; // 放到后面会出现空指针异常
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }
}
