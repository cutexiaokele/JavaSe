package FunctionClass;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        System.out.println(show(()->"你好，我是大罗"));
    }

    public static String show(Supplier<String> sup){
        return sup.get();
    }
}
