package Fanshe;

import Super.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println("通过静态变量.class获取Class对象"+Person.class.getName());
        System.out.println(new Person("你好").getClass().getName());
        System.out.println(Class.forName("Super.Person").getName());

        Class<?> aClass = Class.forName("Super.Person");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(java.lang.String.class);
        Object lisan = declaredConstructor.newInstance("离散");
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(lisan,"王思");
        Person person = (Person)lisan;
        System.out.println(person.getName());
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        

    }
}
