import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    static int count = 0;//记录基本操作次数
    static int ziNum = 0;//记录子问题规模
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入测试数据个数");
        int n = sc.nextInt();
        int a[] = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(10000);
        }
        MergeSort test = new MergeSort();
        test.mergeSort(a);
        System.out.println("基本操作次数：" + count);
        System.out.println("子问题规模：" + ziNum);
    }
    void mergeSort(int[] original) {
        if (original == null) {
            throw new NullPointerException("The array can not be null !!!");
        }
        int length = original.length;
        if (length > 1) {
            ziNum++;
            int middle = length / 2;
            int partitionA[] = Arrays.copyOfRange(original, 0, middle);// 拆分问题规模
            int partitionB[] = Arrays.copyOfRange(original, middle, length);
            // 递归调用
            mergeSort(partitionA);
            mergeSort(partitionB);
            sort(partitionA, partitionB, original);
        }
    }

    private static void sort(int[] partitionA, int[] partitionB, int[] original) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < partitionA.length && j < partitionB.length) {
            count ++;
            if (partitionA[i] <= partitionB[j]) {
                original[k] = partitionA[i];
                i++;
            } else {
                original[k] = partitionB[j];
                j++;
            }
            k++;
        }
        if (i == partitionA.length) {
            while (k < original.length) {
                original[k] = partitionB[j];
                k++;
                j++;
            }
        } else if (j == partitionB.length) {
            while (k < original.length) {
                original[k] = partitionA[i];
                k++;
                i++;
            }
        }
    }
}
