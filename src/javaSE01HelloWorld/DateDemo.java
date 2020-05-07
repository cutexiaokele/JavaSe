package javaSE01HelloWorld;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy~MM~dd");
        //Date parse = simpleDateFormat.parse("2019-09-09");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
