package factory;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Person p1, p2;
        p1 = new Person("Tommy", 21);
        p2 = new Person("Lily", 20);
        Logger logger = new SimpleLogger(Test.class);

        Class c = p1.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                if (field.getType().getSimpleName().equals("String")) {
                    field.set(p1, "Jack");
                } else {
                    field.setInt(p1, 25);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println(p1);
    }
}
