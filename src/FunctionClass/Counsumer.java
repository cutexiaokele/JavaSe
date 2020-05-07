package FunctionClass;

import java.util.function.Consumer;

public class Counsumer {
    public static void main(String[] args) {
        String[] arr= new String[]{"迪丽热巴，女","古力娜扎，女","杨明，男"};
        for (String s : arr) {

            prints(s,s1-> System.out.println("姓名："+ s1.split("，")[0]),s1 -> System.out.println("性别："+ s1.split("，")[1]));
        }
    }

    private static void prints(String arr, Consumer<String> con1, Consumer<String> con2) {

        con1.andThen(con2).accept(arr);
    }
}
