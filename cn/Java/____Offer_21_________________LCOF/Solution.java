// @algorithm @lc id=100291 lang=java 
// @title diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof

package ____Offer_21_________________LCOF;

public class Solution { // NOTE: 双指针
    public int[] exchange(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0, right = nums.length -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                res[left] = nums[i];
                left++;
            } else {
                res[right] = nums[i];
                right--;
            }
        }
        return res;
    }
}