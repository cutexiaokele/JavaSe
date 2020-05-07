package javaSE01HelloWorld;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BirthdayDemo {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse(s);
        long l = System.currentTimeMillis() - parse.getTime();
        long l1 = l / (24 * 60 * 60 * 1000);
        System.out.println(l1);
    }
}
