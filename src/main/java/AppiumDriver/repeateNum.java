package AppiumDriver;

import java.util.Scanner;

//对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
 //       牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小
public class repeateNum {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        int k = sc.nextInt();
//        String b = sc.next();
//        int t = sc.nextInt();
//        String a1 = "";
//        String a2 = "";
//        for (int i = 0; i < k; i++) {
//            a1 += a;
//        }
//
//        for (int j = 0; j < t; j++) {
//            a2 += b;
//        }
//
//        String s = wheater(a1, a2);
//        System.out.println(s);
//    }
//
//
//    public static String wheater(String a1, String a2) {
//        if (a1.length() > a2.length()) {
//            return a1 + " > " + a2;
//        } else if (a1.length() < a2.length()) {
//            return a1 + " < " + a2;
//        } else {
//            for (int i = 0; i < a1.length(); i++) {
//                if (a1.charAt(i) > a2.charAt(i)) {
//                    return a1 + " > " + a2;
//                } else if (a1.charAt(i) < a2.charAt(i)) {
//                    return a1 + " < " + a2;
//                }
//
//            }
//            return a1 + " == " + a2;
//        }
//
        //  System.out.println(fab2(8));


//  public  static int fab(int n){
//        if(n==1|| n==2){
//            return 1;
//        }else{
//            return fab(n-1)+fab(n-2);
//        }


    //  public  static int fab2(int n){
//        int a1=1;
//        int a2=1;
//       int a3=0;
//        for(int i=2;i<n;i++){
//            a3=a1+a2;
//            a1=a2;
//           a2=a3;
//      }
//     return   a3;
    int[] arr = {5, 1, 4, 7, 3};
    int[] arr2 = InsertSort(arr);
        for (int i:arr2
             ) {
            System.out.println(i);
        }
}


    public static int[] InsertSort(int[] arr) {
        int j;
        int n = arr.length;
        int target;

        for (int i = 1; i < n; i++) {
            j = i;
            target = arr[i];

            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    return arr;
}
}
