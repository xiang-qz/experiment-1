import java.util.Random;
import java.util.Scanner;

public class QuickSort {
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
        QuickSort test = new QuickSort();
        test.quickSort(a,0,n-1);
        System.out.println("基本操作次数：" + count);
        System.out.println("子问题规模：" + ziNum);
    }
    void quickSort(int[] a, int left, int right) {
        ziNum++;  //每递归调用一次，子问题规模加1 	
		if(left>right){
            ziNum--;//递归出口，未进行子问题划分
			return;
        }    
		int i=left;
		int j=right;
		int base=a[left];
		while(i!=j) {
			while(a[j]>=base&&i<j){
                j--;
                count++;
            }
            count++;//加上退出循环时未计入的1次比较操作
			while(a[i]<=base&&i<j){
				i++;
                count++;
            }
            count++;//加上退出循环时未计入的1次比较操作
			int temp;
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		a[left]=a[i];
		a[i]=base;
		quickSort(a,left,i-1);
		quickSort(a,i+1,right);
	}
}
