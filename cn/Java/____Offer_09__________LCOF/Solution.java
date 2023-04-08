package ____Offer_09__________LCOF;

import java.util.ArrayDeque;
import java.util.Deque;

// @algorithm @lc id=100273 lang=java 
// @title yong-liang-ge-zhan-shi-xian-dui-lie-lcof

class CQueue { // NOTE: 栈与队列
    // java中的stack是基于vector而实现的类，效率较低，故采用双端队列实现栈的效果
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public CQueue() {
        inStack = new ArrayDeque<Integer>();
        outStack = new ArrayDeque<Integer>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    /**
     * 两个栈维护不同的顺序，出栈的时候颠倒顺序
     * 
     * @return
     */
    public int deleteHead() {
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) {
                return -1;
            } else {
                while (!inStack.isEmpty()) {
                    outStack.push(inStack.pop());
                }
            }
        }
        return outStack.pop();
    }
}