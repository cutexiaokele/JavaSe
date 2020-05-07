package ComparableAndComarator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",19));
        list.add(new Person("李四",17));
        list.add(new Person("王五",29));
        System.out.println(list.toString());

        Collections.sort(list);

        System.out.println(list.toString());
    }
}
