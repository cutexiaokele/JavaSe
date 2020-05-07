package javaSE01HelloWorld;

import java.util.Date;

public class Fuxi {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//获取当前系统时间
        long time = date.getTime();

    }
}
