package JavaPractise;

public class BinSearchTest {

    public static void main(String args[]){
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // 调用查找方法查找给定数组中5元素所在的索引值，并接收查找到的索引
        int index = binSearch(arr, 9);
        // 输出索引
        System.out.println("index:" + index);
    }
    public static int binSearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high )/ 2;
            if (k > arr[mid]) {
                low = mid + 1;
            } else if (k < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
