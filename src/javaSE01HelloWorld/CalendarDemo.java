package javaSE01HelloWorld;

import sun.awt.geom.AreaOp;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(Calendar.YEAR,2088);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.add(Calendar.YEAR,-2);
        System.out.println(calendar.get(Calendar.YEAR));
        Date date = new Date();
        calendar.setTime(date);
        System.out.println(calendar);
    }
}
