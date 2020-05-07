package FunctionClass;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        change("100",s1->Integer.parseInt(s1),s1->String.valueOf(s1+10));
    }

    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        System.out.println(fun1.andThen(fun2).apply(s));
    }
}
