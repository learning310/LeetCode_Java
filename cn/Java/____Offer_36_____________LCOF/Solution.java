// @algorithm @lc id=100305 lang=java
// @title er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof


package ____Offer_36_____________LCOF;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

public class Solution { // NOTE: 搜索算法
    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        inOrder(root);
        // 处理双向链表的头尾两个元素的指针
        head.left = pre;
        pre.right = head;
        return head;
    }

    void inOrder(Node cur) {
        if (cur == null) {
            return;
        }
        // 左子树
        inOrder(cur.left);

        // 根
        if (pre != null) {
            pre.right = cur;
        } else {
            head = cur;
        }
        cur.left = pre;
        pre = cur;
        
        // 右子树
        inOrder(cur.right);
    }
}


