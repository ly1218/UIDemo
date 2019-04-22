package JavaPractise;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import static java.lang.Class.forName;

public class Demo3 {

    public static void main(String arg[]) {
        try {
            Class clazz = Class.forName("JavaPractise.LurayStudent");
            Annotation[] anno = clazz.getAnnotations();
            for (Annotation ab : anno) {
                System.out.println(ab);

                //获得指定类的注解
                SxtTable an = (SxtTable)clazz.getAnnotation(SxtTable.class);
                System.out.println(an.value());

                 //
                Field f = clazz.getDeclaredField("studentName");
                SxFiled sxtField = f.getAnnotation(SxFiled.class);
                System.out.println(sxtField.columnName()+" "+sxtField.type()+"--"+sxtField.length());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
