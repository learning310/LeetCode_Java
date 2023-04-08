# 算法笔记

# 链表

## 题目总结

- [剑指 Offer 06. 从尾到头打印链表](https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/)
- [剑指 Offer 24. 反转链表](https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/)
- [剑指 Offer 35. 复杂链表的复制](https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/)

# 查找算法

## 理论

- `二分法` 需要注意条件中是否包含等于条件，整体结构的代码是不需要调整的
  ``` java
    int begin = 0, end = length - 1;
    while (begin <= end) {
        int mid = (begin + end) / 2;
        if (nums[mid] < target) {
            begin = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return begin;
  ```

## 题目总结

- [剑指 Offer 03. 数组中重复的数字](https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)
- [剑指 Offer 53 - I. 在排序数组中查找数字 I](https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/)
- [剑指 Offer 53 - II. 0～n-1中缺失的数字](https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/)
- [剑指 Offer 04. 二维数组中的查找](https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/)
  - 不需要二分查找
- [剑指 Offer 11. 旋转数组的最小数字](https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/)
  - 重点题目，需要结合题目背景利用二分查找
- [剑指 Offer 50. 第一个只出现一次的字符](https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/)

# 回溯法

## 理论

- 核心：基于递归调用实现，因为每个结点都需要遍历，没有多余计算
- 疑惑：如何用循环实现
  
## 题目总结

- [131. 分割回文串](https://leetcode.cn/problems/palindrome-partitioning/)
- [46. 全排列](https://leetcode.cn/problems/permutations/)
- [47. 全排列 II](https://leetcode.cn/problems/permutations-ii/)
- [17. 电话号码的字母组合](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/)
  - 只需要将待处理的数据遍历一次
- [93. 复原 IP 地址](https://leetcode.cn/problems/restore-ip-addresses/solution/)
  - 待处理数据会经过多次遍历
  - 多种提前结束回溯的原因

# 搜索算法

## 理论

- 广度优先遍历
- 深度优先遍历

## 题目总结

- 矩阵路径
  - [剑指 Offer 12. 矩阵中的路径](https://leetcode.cn/problems/ju-zhen-zhong-de-lu-jing-lcof/)
  - [面试题 13. 机器人的运动范围](https://leetcode.cn/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/solution/)
  - [695. 岛屿的最大面积](https://leetcode.cn/problems/max-area-of-island/)
  - [200. 岛屿数量](https://leetcode.cn/problems/number-of-islands/)
  - [329. 矩阵中的最长递增路径](https://leetcode.cn/problems/longest-increasing-path-in-a-matrix/)
  
# 双指针

## 题目总结

- [剑指 Offer 18. 删除链表的节点](https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/)
- [剑指 Offer 22. 链表中倒数第k个节点](https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/)
- [剑指 Offer 58 - I. 翻转单词顺序](https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/)
- [剑指 Offer 25. 合并两个排序的链表](https://leetcode.cn/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/)
  - dummy head
- [剑指 Offer 52. 两个链表的第一个公共节点](https://leetcode.cn/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/)
  - 双指针相遇
- [剑指 Offer 21. 调整数组顺序使奇数位于偶数前面](https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/)
- [剑指 Offer 57. 和为s的两个数字](https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/)

# 二叉树

## 题目总结

- 层序遍历
  - [剑指 Offer 32 - I. 从上到下打印二叉树](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/)
    - 从上到下打印出二叉树的每个节点 -> 基本的层序遍历
  - [剑指 Offer 32 - II. 从上到下打印二叉树 II](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/)
    - 每一层打印到一行 -> 一层遍历结束的时机
  - [剑指 Offer 32 - III. 从上到下打印二叉树 III](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/)
    - 按照之字形顺序 -> 控制产生数据的顺序
  - [剑指 Offer 55 - I. 二叉树的深度](https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof/)
- 先序遍历
  - [剑指 Offer 34. 二叉树中和为某一值的路径](https://leetcode.cn/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/)
  - [剑指 Offer 26. 树的子结构](https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof/)
  - [剑指 Offer 68 - I. 二叉搜索树的最近公共祖先](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/)
  - [剑指 Offer 68 - II. 二叉树的最近公共祖先](https://leetcode.cn/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/)
- 中序遍历
  - [剑指 Offer 36. 二叉搜索树与双向链表](https://leetcode.cn/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/)
  - [剑指 Offer 54. 二叉搜索树的第k大节点](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/)
    - 倒序中序遍历
- 后序遍历
  - [剑指 Offer 27. 二叉树的镜像](https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/)
  - [剑指 Offer 55 - II. 平衡二叉树](https://leetcode.cn/problems/ping-heng-er-cha-shu-lcof/)

# 动态规划

## 题目总结

- 基础
  - [70. 爬楼梯](https://leetcode.cn/problems/climbing-stairs/)
  - [剑指 Offer 10- I. 斐波那契数列](https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/)
  - [剑指 Offer 10- II. 青蛙跳台阶问题](https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/)
- 二维矩阵向右向下
  - [62. 不同路径](https://leetcode.cn/problems/unique-paths/)
  - [63. 不同路径 II](https://leetcode.cn/problems/unique-paths-ii/)
  - [64. 最小路径和](https://leetcode.cn/problems/minimum-path-sum/)
  - [剑指 Offer 47. 礼物的最大价值](https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof/)
- 打家劫舍
  - [198. 打家劫舍](https://leetcode.cn/problems/house-robber/)
  - [213. 打家劫舍 II](https://leetcode.cn/problems/house-robber-ii/)
  - [337. 打家劫舍 III](https://leetcode.cn/problems/house-robber-iii/)
- 数字组合
  - [91. 解码方法](https://leetcode.cn/problems/decode-ways/)
  - [剑指 Offer 46. 把数字翻译成字符串](https://leetcode.cn/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/)
- [120. 三角形最小路径和](https://leetcode.cn/problems/triangle/)
- [139. 单词拆分](https://leetcode.cn/problems/word-break/)
- [300. 最长递增子序列](https://leetcode.cn/problems/longest-increasing-subsequence/)
- [322. 零钱兑换](https://leetcode.cn/problems/coin-change/)
- [343. 整数拆分](https://leetcode.cn/problems/integer-break/)
- [376. 摆动序列](https://leetcode.cn/problems/wiggle-subsequence/)
- [377. 组合总和 IV](https://leetcode.cn/problems/combination-sum-iv/)
- [416. 分割等和子集](https://leetcode.cn/problems/partition-equal-subset-sum/)
- [494. 目标和](https://leetcode.cn/problems/target-sum/)
- [剑指 Offer 63. 股票的最大利润](https://leetcode.cn/problems/gu-piao-de-zui-da-li-run-lcof/)
- [剑指 Offer 42. 连续子数组的最大和](https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/)


# 贪心算法

## 题目总结

- [279. 完全平方数](https://leetcode.cn/problems/perfect-squares/)
- [392. 判断子序列](https://leetcode.cn/problems/is-subsequence/)
- [435. 无重叠区间](https://leetcode.cn/problems/non-overlapping-intervals/)
- [455. 分发饼干](https://leetcode.cn/problems/assign-cookies/)

# 排序算法

## 题目总结

- [剑指 Offer 45. 把数组排成最小的数](https://leetcode.cn/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/)
- [剑指 Offer 61. 扑克牌中的顺子](https://leetcode.cn/problems/bu-ke-pai-zhong-de-shun-zi-lcof/)
- [剑指 Offer 40. 最小的k个数](https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/)
- [剑指 Offer 41. 数据流中的中位数](https://leetcode.cn/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/)

# 分治算法

## 题目总结

- [剑指 Offer 07. 重建二叉树](https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof/)
- [剑指 Offer 16. 数值的整数次方](https://leetcode.cn/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/)
- [剑指 Offer 33. 二叉搜索树的后序遍历序列](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/)

# 位运算

## 题目总结

- [剑指 Offer 15. 二进制中1的个数](https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/)
- [剑指 Offer 65. 不用加减乘除做加法](https://leetcode.cn/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/)