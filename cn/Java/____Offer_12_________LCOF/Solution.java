// @algorithm @lc id=100279 lang=java
// @title ju-zhen-zhong-de-lu-jing-lcof


package ____Offer_12_________LCOF;

// @test([["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]],"ABCCED")=true
public class Solution { // NOTE: 搜索算法
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, words, i, j, 0)) { // 从[i,j]开始进行搜索
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 
     * @param k 可以确认字符的累积个数
     */
    boolean dfs(char[][] board, char[] words, int i, int j, int k) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0
                || board[i][j] != words[k]) {
            return false;
        }
        if (k == words.length - 1) {
            return true;
        }
        board[i][j] = '\0'; // 对符合条件的遍历路径进行标识，使其纳入递归递归结束条件
        // 遍历顺序：下、上、右、左
        boolean res = dfs(board, words, i + 1, j, k + 1) || dfs(board, words, i - 1, j, k + 1)
                || dfs(board, words, i, j + 1, k + 1) || dfs(board, words, i, j - 1, k + 1);
        board[i][j] = words[k]; // 还原为原始情况，使得后面的迭代可以正常进行
        return res;
    }
}
