package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ReturnFunctional {
    public static void main(String[] args) {
        getThread(2,()-> System.out.println("你好啊"));
        String[] strings = new String[]{"aaaa","vvv","ccccc","bbbbbb"};
        Arrays.sort(strings,getComparator());
        System.out.println(Arrays.toString(strings));

    }

    private static Comparator<String> getComparator() {
        return ((o1, o2) ->o1.length()-o2.length() );
    }

    private static void getThread(Integer le, Runnable runnable) {
        if (le == 1) {
            new Thread(runnable).start();
        }
    }
}
