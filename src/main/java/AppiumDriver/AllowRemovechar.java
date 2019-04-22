package AppiumDriver;

import java.util.*;

public class AllowRemovechar {
    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        Scanner st = new Scanner(System.in);
//        int k = st.nextInt();
//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//        char[] c = s.toCharArray();
//        for (char cc : c) {
//            if (map.containsKey(cc)) {
//                map.put(cc, map.get(cc) + 1);
//
//            } else {
//                map.put(cc, 1);
//            }
//        }
//            List<Integer> list = new ArrayList<Integer>(map.values());
//            int arr[] = new int[list.size()];
//            for (int i = 0; i < list.size(); i++) {
//                arr[i] = list.get(i);
//
//            }
//            for (int i = 0; i < k; i++) {
//                Arrays.sort(arr);
//                arr[arr.length - 1]--;
//
//            }
//            System.out.println(pingfang(arr));
//        }
//
//        public static int pingfang (int a[]){
//            int sum = 0;
//            for (int i = 0; i < a.length; i++)
//                sum += a[i] * a[i];
//            return sum;

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(num(s));
    }


    public static int num(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                left++;
            } else {
                if (left != 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }
            return left + right;

        }


}
