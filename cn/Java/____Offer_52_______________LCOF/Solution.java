// @algorithm @lc id=100326 lang=java 
// @title liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof

package ____Offer_52_______________LCOF;

import algm.*;

public class Solution { // NOTE: 双指针
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != B) {
            A = A != null ? A.next : headB; // A接B
            B = B != null ? B.next : headA; // B接A
        }
        return A;
    }
}