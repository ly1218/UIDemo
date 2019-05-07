package AppiumDriver;

public class OldInBeforeEven2 {
    public  void reOrrde(int[] array){
        if(array==null||array.length==0)
            return;
        for(int i=1;i< array.length;i++){
            int target=array[i];
            if(array[i]%2==1){
                int j=i;
                while(j>0 && array[j]==0){
                    array[j]=array[j-1];
                    j--;
                }
                array[j]=target;
            }
        }
    }
}
