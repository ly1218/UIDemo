package JavaPractise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo4 {

    public  static void main(String args[]) {
        try{
            Class aClass = Class.forName("JavaPractise.User");
            System.out.println(aClass.getName());
            System.out.println(aClass.getSimpleName());
            Field[] f = aClass.getDeclaredFields();
            System.out.println(f.length);
            for (Field tem:f) {
            System.out.println("属性"+tem);
                Method setAge = aClass.getDeclaredMethod("setAge", int.class);
                //
                System.out.println("woshi wet"+setAge);
                Method[] dm = aClass.getDeclaredMethods();
                for (Method m:dm) {
                    System.out.println(m);

                }


                Constructor[] de = aClass.getDeclaredConstructors();
                aClass.getDeclaredConstructor(int.class,String.class,int.class);
                for (Constructor d :de ) {
                    System.out.println("我是构造器 "+d);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
