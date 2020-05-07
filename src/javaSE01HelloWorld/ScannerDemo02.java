package javaSE01HelloWorld;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ScannerDemo02 {
    public static void main(String[] args) {
        char[] chars = new char[]{'a','b','c'};
        String s = new String(chars);
        System.out.println("这是字符串" + s);
        System.out.println("字符串的长度是" + s.length());
        System.out.println("字符串的第一个a字母在位置"+s.indexOf("a"));
        System.out.println(s.charAt(2));
        System.out.println(s.substring(0, 1));
        System.out.println(s.substring(1));


    }
}
