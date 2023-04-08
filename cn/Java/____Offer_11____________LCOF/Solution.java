// @algorithm @lc id=100278 lang=java
// @title xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof


package ____Offer_11____________LCOF;


// @test([3,4,5,1,2])=1
// @test([1,3,5])=1
// @test([2,2,2,0,1])=0

public class Solution { // NOTE: 查找算法
    public int minArray(int[] numbers) {
        int begin = 0, end = numbers.length - 1;

        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (numbers[mid] > numbers[end]) { // mid 之后存在旋转
                begin = mid + 1;
            } else if (numbers[mid] < numbers[end]) { // mid 之后为正常顺序
                end = mid;
            } else { // 无法确定任何信息，只能缩小范围
                end = end - 1;
            }
        }
        return numbers[begin];
    }
}
