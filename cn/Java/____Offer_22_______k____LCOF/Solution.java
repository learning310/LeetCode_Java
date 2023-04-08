// @algorithm @lc id=100294 lang=java
// @title lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof


package ____Offer_22_______k____LCOF;

import algm.*;

// @test([1,2,3,4,5],2)=2
public class Solution { // NOTE: 双指针
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode start = head;
        ListNode end = head.next;

        int i = 1;
        while (i < k) {
            end = end.next;
            i++;
        }

        while (end != null) {
            start = start.next;
            end = end.next;
        }

        return start;
    }
}
