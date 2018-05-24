package libs;

import java.util.Random;

public class NumberFormat {
    public static void main(String[] args) {
        int [] a = new int[20];
        int [] b = new int[20];
        Random r = new Random();
        // 生成20个1000-9999之间的整数
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(9000) + 1000;
        }
        for(int i: a) {
            System.out.println(i);
        }
        // 复制数组
        System.out.println("----------------");
        System.arraycopy(a, 0, b, 0, 20);
        for(int i: b) {
            System.out.println(i);
        }
        // 排序，土了点，冒泡法
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < i; j++) {
                int m = b[i] % 1000;
                int n = b[j] % 1000;
                if (m < n) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.println("----------------");
        for(int i: b) {
            System.out.println(i);
        }
    }
}
