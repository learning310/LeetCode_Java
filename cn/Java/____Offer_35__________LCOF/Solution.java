// @algorithm @lc id=100300 lang=java 
// @title fu-za-lian-biao-de-fu-zhi-lcof

package ____Offer_35__________LCOF;

import java.util.HashMap;
import java.util.Map;


/* class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
} */
public class Solution { // NOTE: 链表

    /**
     * 将新创建的节点插入在原链表两个结点的中间，使得通过原结点的random指针的旁边就是对应的新建结点
     * 
     * @param head
     * @return
     */
    public Node copyRandomList1(Node head) {
        if (head == null)
            return null;
        // 1. 生成新节点，构建拼接链表
        // [原节点 1 -> 新节点 1 -> 原节点 2 -> 新节点 2 -> ……]
        Node cur = head;
        while (cur != null) {
            Node tmp = new Node(cur.val);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }
        // 2. 修改新节点的random指向
        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                // 新结点的random = 原结点的random(原结点)的新节点
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        Node res = head.next; // 记录新链表头

        // 3. 拆分链表
        Node pre = head;
        cur = head.next;
        while (cur.next != null) {
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null; // 为了减少在循环体中的判断，单独处理尾部
        return res;
    }


    /**
     * 借助集合使得查找新建结点很方便，故可以通过原始链表结点的random确定对应的新建结点
     * 
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;
        Node cur = head;
        Map<Node, Node> map = new HashMap<>();
        // 1. 生成新节点，并建立 “原节点 -> 新节点” 的 Map 映射
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        // 2. 构建新链表的 next 和 random 指向
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        // 5. 返回新链表的头节点
        return map.get(head);
    }
}


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
