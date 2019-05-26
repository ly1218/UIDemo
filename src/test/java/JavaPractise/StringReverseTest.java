package JavaPractise;

public class StringReverseTest {

    public static void main(String args[]){
   System.out.println(reverseStr("aba"));
    }
    public static String reverseStr(String str){
        if(str.length()==0){
            return null;
        }
     char[] c= str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=c.length-1;i>=0;i--){
            sb.append(c[i]);

        }
    return sb.toString();
    }

}
