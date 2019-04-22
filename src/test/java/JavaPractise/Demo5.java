package JavaPractise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo5 {

    public static void main(String args[]) {

        try {
            Class aClass = Class.forName("JavaPractise.User");
            User u = (User) aClass.newInstance();
            System.out.println(aClass);

            //
            Constructor c = aClass.getDeclaredConstructor(int.class, String.class, int.class);
            User u2= (User) c.newInstance(1, "hsan", 16);
            System.out.println(u2.getName());

            //
            User u3 = (User) aClass.newInstance();
          Method m=   aClass.getDeclaredMethod("setName", String.class);
          m.invoke(u3,"liguo");
          System.out.println(u3.getName());

            User u4 = (User) aClass.newInstance();
            Field name = aClass.getDeclaredField("name");
            name.setAccessible(true);
            name.set(u4,"liyan");
            System.out.println(u4.getName());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}