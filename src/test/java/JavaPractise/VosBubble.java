package JavaPractise;

public class VosBubble {

    public static void main(String args[]){
        int arr[]={5,6,7,1,2,4};

        System.out.println("排序前：");
        for(int ar:arr){
            System.out.println(ar);
        }
        System.out.println("排序后");
        sortIdex(arr);
        for(int ar:arr){
            System.out.println(ar);
        }
    }

    public static void sortIdex(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                   int teamp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=teamp;
                }
            }
        }
    }
}
