package FunctionClass;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String[] arr= new String[]{"迪丽热巴，女","古力娜扎，女","杨明，男"};
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            if (test(s, s1 -> s1.split("，")[0].length() == 4, s1 -> s1.split("，")[1] .equals("女"))) {
                list.add(s);
            }
        }
        System.out.println(list.toString());

        System.out.println(arr[0].split("，")[1]);
        System.out.println("迪丽热巴，女");
        System.out.println(arr[0] == "女");

    }
    public static boolean test(String a, Predicate<String> pro1,Predicate<String> pro2){
        return pro1.and(pro2).test(a);
    }
}
