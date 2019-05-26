package JavaPractise;

import java.util.HashMap;
import java.util.Map;

public class HasOnlyCharacter {

    public static int  findStr(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        char[] c = str.toCharArray();
        HashMap<Character, Integer> h = new HashMap<Character, Integer>();


        for (int i = 0; i < c.length; i++) {
            if (h.containsKey(c[i])) {
                h.put(c[i], h.get(c[i]) + 1);
            } else {
                h.put(c[i], 1);
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (h.get(c[i]) == 1) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]){
      System.out.println(  HasOnlyCharacter.findStr("abedfdfdeab"));
    }
}

