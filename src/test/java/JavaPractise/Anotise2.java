package JavaPractise;

import java.lang.annotation.*;

@Target(value={ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Anotise2 {
    String studentName() ;
  int age() default 0;
  int id() default -1;



}
