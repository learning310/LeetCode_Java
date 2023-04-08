// @algorithm @lc id=100301 lang=java
// @title zui-xiao-de-kge-shu-lcof


package ____Offer_40____k____LCOF;

import java.util.Arrays;
import java.util.Comparator;

// @test([0,1,2,1],1)=[0]
// @test([3,2,1],2)=[1,2]
public class Solution { // NOTE: 排序
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    <T> void InsertSort(T[] A, Comparator<? super T> c) {
        for (int i = 2; i < A.length; i++) {
            if (c.compare(A[i], A[i - 1]) < 0) {
                A[0] = A[i]; // 0号作为哨兵
                int j = i - 1;
                for (; c.compare(A[0], A[j]) < 0; j--) {
                    A[j + 1] = A[j]; // 向后挪位
                }
                A[j + 1] = A[0]; // 复制到插入位置
            }
        }
    }

    <T> void InsertSort1(T[] A, Comparator<? super T> c) {
        for (int i = 2; i < A.length; i++) {
            A[0] = A[i];
            int low = 1, high = i - 1;
            while (low <= high) { // 折半查找
                int mid = (low + high) / 2;
                if (c.compare(A[mid], A[0]) > 0) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            for (int j = i - 1; j >= high + 1; j--) {
                A[j + 1] = A[j]; // 向后挪位
            }
            A[high + 1] = A[0];
        }
    }

    <T> void BubbleSort(T[] A, Comparator<? super T> c) {
        for (int i = 0; i < A.length; i++) { // 最小的元素放在i
            boolean flag = false;
            for (int j = A.length - 1; j > i; j--) {
                if (c.compare(A[j - 1], A[j]) > 0) { // 逆序交换
                    flag = true;
                    T temp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = temp;
                }
            }
            if (flag == false) {
                return;
            }
        }
    }

    <T> void QuickSort(T[] A, int low, int high, Comparator<? super T> c) {
        if (low < high) {
            int pivotPos = Partition(A, low, high, c);
            QuickSort(A, low, pivotPos - 1, c);
            QuickSort(A, pivotPos + 1, high, c);
        }
    }

    <T> int Partition(T[] A, int low, int high, Comparator<? super T> c) {
        T pivot = A[low];
        while (low < high) {
            while (low < high && c.compare(A[high], pivot) >= 0) {
                high--;
            }
            A[low] = A[high];
            while (low < high && c.compare(A[low], pivot) <= 0) {
                low++;
            }
            A[high] = A[low];
        }
        A[low] = pivot;
        return low;
    }

    <T> void SelectSort(T[] A, Comparator<? super T> c) {
        for (int i = 0; i < A.length - 1; i++) {
            int min = i; // 第i个位置的元素是最小的
            for (int j = i + 1; j < A.length; j++) {
                if (c.compare(A[j], A[min]) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                T temp = A[i];
                A[i] = A[min];
                A[min] = temp;
            }
        }
    }

    <T> void BuildMaxHeap(T[] A, Comparator<? super T> c) {
        for (int i = A.length / 2; i > 0; i--) {
            HeadAdjust(A, i, A.length, c);
        }
    }

    <T> void HeadAdjust(T[] A, int k, int n,  Comparator<? super T> c) {
        A[0] = A[k];
        for (int i = 2 * k; i < n; i *= 2) {
            if (i < n && c.compare(A[i], A[i + 1]) < 0) {
                i++;
            }
            if (c.compare(A[0], A[i]) >= 0) {
                break;
            } else {
                A[k] = A[i];
                k = 1;
            }
        }
        A[k] = A[0];
    }

    <T> void HeapSort(T[] A, Comparator<? super T> c) {
        BuildMaxHeap(A, c);
        for (int i =A.length; i > 1; i--) {
            T temp = A[i];
            A[i] = A[1];
            A[1] = temp;
            HeadAdjust(A, 1, i-1,c);
        }
    }

    <T> void Merge(T[] A, int low, int mid, int high, Comparator<? super T> c) {
        
    }

    <T> void MergeSort(T[] A, int low, int high, Comparator<? super T> c) {
        if (low < high) {
            int mid = (low + high) / 2;
            MergeSort(A, low, mid, c);
            MergeSort(A, mid + 1, high, c);
            Merge(A, low, mid, high, c);
        }
    }
}
