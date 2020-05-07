package javaSE01HelloWorld;

import java.util.Date;

public class NumberFormat {
    public static void main(String[] args) {
       String a = "123456";
        int i = Integer.parseInt(a);
        System.out.println(i);

        double v = Double.parseDouble(a);
        System.out.println(v);

        String s = Double.toString(v);
        String s1 = new Double(v).toString();
        System.out.println(s+"aa"+s1);
    }
}
