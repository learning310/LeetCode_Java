// @algorithm @lc id=100276 lang=java 
// @title er-wei-shu-zu-zhong-de-cha-zhao-lcof


package ____Offer_04__________LCOF;

// @test([[]], 20)=false
public class Solution { // NOTE: 查找算法
    /**
     * 将切换行和列的动作通过条件判定整合在一起
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0; // 即从最后一行的头部开始遍历
        while (i >= 0 && j < matrix[0].length) { // 这里利用了短路原则，避免了数组越界
            if (matrix[i][j] > target) {
                i--; // 当前行不可能有元素
            } else if (matrix[i][j] < target) {
                j++; // 在当前行内查找
            } else {
                return true;
            }
        }
        return false;
    }
}

