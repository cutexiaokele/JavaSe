package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        Object[] objects = arrayList.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
