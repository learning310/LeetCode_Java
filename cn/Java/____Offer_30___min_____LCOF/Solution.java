package ____Offer_30___min_____LCOF;

import java.util.ArrayDeque;
import java.util.Deque;

// @algorithm @lc id=100302 lang=java 
// @title bao-han-minhan-shu-de-zhan-lcof

class MinStack { // NOTE: 栈与队列

    /*
     * 实现思路：维护最小元素
     * 两种实现：
     * 1. 往原始栈中push元素的同时往辅助栈push一下当时最小的原始，这样pop的时候不需要判断
     * 2. 往原始栈中push元素时发现当前元素比辅助栈栈顶元素更小，则压入栈，pop的时候需要加一个判断
     */
    Deque<Integer> rawStack;
    Deque<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        rawStack = new ArrayDeque<Integer>();
        minStack = new ArrayDeque<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        rawStack.push(x);
        if (minStack.peek() >= x) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (rawStack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return rawStack.peek();
    }

    public int min() {
        return minStack.peek();
    }

}