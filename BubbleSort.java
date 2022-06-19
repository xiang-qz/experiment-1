import java.util.Random;
import java.util.Scanner;
class BubbleSort{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入测试数据个数");
        int n = sc.nextInt();
        int a[] = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(5000);
        }
        BubbleSort test = new BubbleSort();
        int count =test.bubbleSort(a);
        System.out.println("基本操作次数：" + count);
    }
    int bubbleSort(int a[]){
        int count = 0;//记录基本操作次数
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if(a[j] < a[j-1]){
                    swap(a[j],a[j-1]);
                    count ++;
                }
            }
        }
        return count;
    }
    void swap(int n,int m){
        int temp = n;
        n = m;
        m = temp;
    }
}