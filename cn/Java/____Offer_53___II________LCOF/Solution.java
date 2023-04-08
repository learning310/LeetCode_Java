// @algorithm @lc id=100331 lang=java 
// @title que-shi-de-shu-zi-lcof


package ____Offer_53___II________LCOF;

public class Solution { // NOTE: 查找算法
    /**
     * 核心在于结合二分法和题目条件确定缩小范围的思路
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int begin = 0, end = nums.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] == mid) { // 这个条件成立就说明之前的元素肯定都没问题
                begin = mid + 1;
            } else {
                end = mid - 1; // 将缺失元素划分在左半边搜索
            }
        }
        return begin;
    }
}
