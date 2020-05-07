package collection;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        System.out.println("a:"+listTest(list,"a"));

    }

    private static Integer listTest(ArrayList<String> list, String a) {
        int count=0;
        for (String s : list) {
            if (s.equals(a)){
            count++;}
        }
        return count;
    }


}
