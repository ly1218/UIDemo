package JavaPractise;

import java.util.Arrays;

public class hasAlreadyHalfNum {

    public static void main(String args[]) {
        int arr[] = {2, 2, 6, 2, 2, 2, 1, 8};

        System.out.println(moreHalfNum(arr));
    }


    public static int moreHalfNum(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length / 2]) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return arr[arr.length / 2];
        } else {
            return 0;
        }
    }
}


