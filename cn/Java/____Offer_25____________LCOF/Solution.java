// @algorithm @lc id=100286 lang=java 
// @title he-bing-liang-ge-pai-xu-de-lian-biao-lcof

package ____Offer_25____________LCOF;

import algm.*;

//@test([1,3,4],[2,5,7])=[1,2,3,4,5,7]
//@test([],[])=[]
public class Solution { // NOTE: 双指针
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0), cur = dum; // dummy head
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return dum.next;
    }
}