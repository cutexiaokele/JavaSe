package javaSE01HelloWorld;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        String s = "abcdfds3432";
        char[] chars = s.toCharArray();
        Arrays.sort(chars,0,3);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
