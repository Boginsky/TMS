package lesson12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            Class<?> cl = myService.getClass();
            Annotation[] classAnnotations = cl.getAnnotations();
            if (classAnnotations.length > 0){
                MyService myService1 = new MyService();
                myService1.setId(44);
                myService1.setName("Delivery");
                Method method = myService1.getClass().getDeclaredMethod("thisClassInfo");
                method.setAccessible(true);
                method.invoke(myService1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
