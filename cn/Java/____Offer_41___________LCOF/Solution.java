// @algorithm @lc id=100303 lang=java
// @title shu-ju-liu-zhong-de-zhong-wei-shu-lcof

package ____Offer_41___________LCOF;

import java.util.PriorityQueue;
import java.util.Queue;

class MedianFinder { // NOTE: 排序
    Queue<Integer> A, B;

    /** initialize your data structure here. */
    public MedianFinder() {
        A = new PriorityQueue<>();
        B = new PriorityQueue<>((x, y) -> (y - x));
    }

    public void addNum(int num) {
        if (A.size() != B.size()) {
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        return A.size() != B.size() ? A.peek() : (A.peek() + B.peek()) / 2.0;
    }
}
