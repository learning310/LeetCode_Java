# �㷨�ʼ�

# ����

## ��Ŀ�ܽ�

- [��ָ Offer 06. ��β��ͷ��ӡ����](https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/)
- [��ָ Offer 24. ��ת����](https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/)
- [��ָ Offer 35. ��������ĸ���](https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/)

# �����㷨

## ����

- `���ַ�` ��Ҫע���������Ƿ������������������ṹ�Ĵ����ǲ���Ҫ������
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

## ��Ŀ�ܽ�

- [��ָ Offer 03. �������ظ�������](https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)
- [��ָ Offer 53 - I. �����������в������� I](https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/)
- [��ָ Offer 53 - II. 0��n-1��ȱʧ������](https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/)
- [��ָ Offer 04. ��ά�����еĲ���](https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/)
  - ����Ҫ���ֲ���
- [��ָ Offer 11. ��ת�������С����](https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/)
  - �ص���Ŀ����Ҫ�����Ŀ�������ö��ֲ���
- [��ָ Offer 50. ��һ��ֻ����һ�ε��ַ�](https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/)

# ���ݷ�

## ����

- ���ģ����ڵݹ����ʵ�֣���Ϊÿ����㶼��Ҫ������û�ж������
- �ɻ������ѭ��ʵ��
  
## ��Ŀ�ܽ�

- [131. �ָ���Ĵ�](https://leetcode.cn/problems/palindrome-partitioning/)
- [46. ȫ����](https://leetcode.cn/problems/permutations/)
- [47. ȫ���� II](https://leetcode.cn/problems/permutations-ii/)
- [17. �绰�������ĸ���](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/)
  - ֻ��Ҫ������������ݱ���һ��
- [93. ��ԭ IP ��ַ](https://leetcode.cn/problems/restore-ip-addresses/solution/)
  - ���������ݻᾭ����α���
  - ������ǰ�������ݵ�ԭ��

# �����㷨

## ����

- ������ȱ���
- ������ȱ���

## ��Ŀ�ܽ�

- ����·��
  - [��ָ Offer 12. �����е�·��](https://leetcode.cn/problems/ju-zhen-zhong-de-lu-jing-lcof/)
  - [������ 13. �����˵��˶���Χ](https://leetcode.cn/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/solution/)
  - [695. �����������](https://leetcode.cn/problems/max-area-of-island/)
  - [200. ��������](https://leetcode.cn/problems/number-of-islands/)
  - [329. �����е������·��](https://leetcode.cn/problems/longest-increasing-path-in-a-matrix/)
  
# ˫ָ��

## ��Ŀ�ܽ�

- [��ָ Offer 18. ɾ������Ľڵ�](https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/)
- [��ָ Offer 22. �����е�����k���ڵ�](https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/)
- [��ָ Offer 58 - I. ��ת����˳��](https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/)
- [��ָ Offer 25. �ϲ��������������](https://leetcode.cn/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/)
  - dummy head
- [��ָ Offer 52. ��������ĵ�һ�������ڵ�](https://leetcode.cn/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/)
  - ˫ָ������
- [��ָ Offer 21. ��������˳��ʹ����λ��ż��ǰ��](https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/)
- [��ָ Offer 57. ��Ϊs����������](https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/)

# ������

## ��Ŀ�ܽ�

- �������
  - [��ָ Offer 32 - I. ���ϵ��´�ӡ������](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/)
    - ���ϵ��´�ӡ����������ÿ���ڵ� -> �����Ĳ������
  - [��ָ Offer 32 - II. ���ϵ��´�ӡ������ II](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/)
    - ÿһ���ӡ��һ�� -> һ�����������ʱ��
  - [��ָ Offer 32 - III. ���ϵ��´�ӡ������ III](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/)
    - ����֮����˳�� -> ���Ʋ������ݵ�˳��
  - [��ָ Offer 55 - I. �����������](https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof/)
- �������
  - [��ָ Offer 34. �������к�Ϊĳһֵ��·��](https://leetcode.cn/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/)
  - [��ָ Offer 26. �����ӽṹ](https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof/)
  - [��ָ Offer 68 - I. �����������������������](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/)
  - [��ָ Offer 68 - II. �������������������](https://leetcode.cn/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/)
- �������
  - [��ָ Offer 36. ������������˫������](https://leetcode.cn/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/)
  - [��ָ Offer 54. �����������ĵ�k��ڵ�](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/)
    - �����������
- �������
  - [��ָ Offer 27. �������ľ���](https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/)
  - [��ָ Offer 55 - II. ƽ�������](https://leetcode.cn/problems/ping-heng-er-cha-shu-lcof/)

# ��̬�滮

## ��Ŀ�ܽ�

- ����
  - [70. ��¥��](https://leetcode.cn/problems/climbing-stairs/)
  - [��ָ Offer 10- I. 쳲���������](https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/)
  - [��ָ Offer 10- II. ������̨������](https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/)
- ��ά������������
  - [62. ��ͬ·��](https://leetcode.cn/problems/unique-paths/)
  - [63. ��ͬ·�� II](https://leetcode.cn/problems/unique-paths-ii/)
  - [64. ��С·����](https://leetcode.cn/problems/minimum-path-sum/)
  - [��ָ Offer 47. ���������ֵ](https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof/)
- ��ҽ���
  - [198. ��ҽ���](https://leetcode.cn/problems/house-robber/)
  - [213. ��ҽ��� II](https://leetcode.cn/problems/house-robber-ii/)
  - [337. ��ҽ��� III](https://leetcode.cn/problems/house-robber-iii/)
- �������
  - [91. ���뷽��](https://leetcode.cn/problems/decode-ways/)
  - [��ָ Offer 46. �����ַ�����ַ���](https://leetcode.cn/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/)
- [120. ��������С·����](https://leetcode.cn/problems/triangle/)
- [139. ���ʲ��](https://leetcode.cn/problems/word-break/)
- [300. �����������](https://leetcode.cn/problems/longest-increasing-subsequence/)
- [322. ��Ǯ�һ�](https://leetcode.cn/problems/coin-change/)
- [343. �������](https://leetcode.cn/problems/integer-break/)
- [376. �ڶ�����](https://leetcode.cn/problems/wiggle-subsequence/)
- [377. ����ܺ� IV](https://leetcode.cn/problems/combination-sum-iv/)
- [416. �ָ�Ⱥ��Ӽ�](https://leetcode.cn/problems/partition-equal-subset-sum/)
- [494. Ŀ���](https://leetcode.cn/problems/target-sum/)
- [��ָ Offer 63. ��Ʊ���������](https://leetcode.cn/problems/gu-piao-de-zui-da-li-run-lcof/)
- [��ָ Offer 42. ���������������](https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/)


# ̰���㷨

## ��Ŀ�ܽ�

- [279. ��ȫƽ����](https://leetcode.cn/problems/perfect-squares/)
- [392. �ж�������](https://leetcode.cn/problems/is-subsequence/)
- [435. ���ص�����](https://leetcode.cn/problems/non-overlapping-intervals/)
- [455. �ַ�����](https://leetcode.cn/problems/assign-cookies/)

# �����㷨

## ��Ŀ�ܽ�

- [��ָ Offer 45. �������ų���С����](https://leetcode.cn/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/)
- [��ָ Offer 61. �˿����е�˳��](https://leetcode.cn/problems/bu-ke-pai-zhong-de-shun-zi-lcof/)
- [��ָ Offer 40. ��С��k����](https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/)
- [��ָ Offer 41. �������е���λ��](https://leetcode.cn/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/)

# �����㷨

## ��Ŀ�ܽ�

- [��ָ Offer 07. �ؽ�������](https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof/)
- [��ָ Offer 16. ��ֵ�������η�](https://leetcode.cn/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/)
- [��ָ Offer 33. �����������ĺ����������](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/)

# λ����

## ��Ŀ�ܽ�

- [��ָ Offer 15. ��������1�ĸ���](https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/)
- [��ָ Offer 65. ���üӼ��˳����ӷ�](https://leetcode.cn/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/)