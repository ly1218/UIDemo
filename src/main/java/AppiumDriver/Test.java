package AppiumDriver;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        char[] arr = c.toCharArray();
        HashSet h = new HashSet();
        StringBuffer b = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            char t = arr[i];
            if (h.add(t))
                b.append(t);

        }
        System.out.print(b.toString());
//

//        Scanner sc = new Scanner(System.in);
//        int  a = sc.nextInt();
//        int  b = sc.nextInt();
//        int  c= sc.nextInt();
//        int  d = sc.nextInt();
//        int[] arr=new int[]{a,b,c,d};
//        Arrays.sort(arr);
//        int second=arr[2];
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//        int f= Math.abs(second-arr[i]);
//        sum+=f;
//        }
//        System.out.println(sum);
    }
  //拼凑正方形   删除重复字符串
  }


