package collection;

import java.util.ArrayList;

public class CollectionDemo4 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("s");
        listTest(strings,"s");
    }

    private static void listTest(ArrayList<String> strings, String s) {
        System.out.println(strings.contains(s));
    }
}
