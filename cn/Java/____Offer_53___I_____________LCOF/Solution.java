// @algorithm @lc id=100329 lang=java 
// @title zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof


package ____Offer_53___I_____________LCOF;

// @test([5,7,7,8,8,10],6)=0
public class Solution { // NOTE: 查找算法
    /**
     * 二分查找两次，做差得到结果
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        return helper(nums, target + 1) - helper(nums, target);     // 找到的是'>=target'的第一个索引
        // return helper(nums, target) - helper(nums, target - 1); // 找到的是'>target'的第一个索引
    }

    int helper(int[] nums, int target) {
        int begin = 0, end = nums.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] < target) { // 等于target如何处理将决定最终返回的索引所指向的位置
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return begin;
    }
}
