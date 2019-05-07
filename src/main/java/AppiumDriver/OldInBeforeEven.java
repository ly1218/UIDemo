package AppiumDriver;

import jdk.nashorn.internal.runtime.FindProperty;

public class OldInBeforeEven {
    public static boolean Find(int target,int [][] array){
        int len= array.length-1;
        int i=0;
        while(len>=0&& i<array[0].length){
            if(array[len][i]>target){
                len--;
            }else if(array[len][i]<target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int [][] arr={{1,2,3},{4,5,6},{44,45,49}};
        int target=5;
        System.out.println(Find(target,arr));
    }
}
