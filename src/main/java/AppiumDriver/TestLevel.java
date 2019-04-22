package AppiumDriver;

import java.util.Scanner;
//回文素数
public class TestLevel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (isSu(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isSu(int num) {
        boolean b = true;
        if (num == 1 || num == 2)
            b = false;
        int k = (int) Math.sqrt(num);
        for (int i = 2; i < k; i++) {
            if (k % i == 0)
                b = false;
            break;
        }
        boolean h = true;
        int count = 0;
        String str = String.valueOf(num);
        StringBuffer str2 = new StringBuffer(str);
        str2.reverse();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                h = false;
                break;
            } else {
                count++;
            }
        }
        if (count == str.length()) {
            h = true;
        }
        return b && h;
    }
}