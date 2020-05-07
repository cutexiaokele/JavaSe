package FunctionClass;

import java.util.function.Predicate;

public class Product {
    public static void main(String[] args) {
        boolean b = tests("你好", s -> s.length() > 1);
        System.out.println(b);
    }
    public static boolean tests(String s,Predicate<String> predicate){
        return predicate.test(s);
    }
}
