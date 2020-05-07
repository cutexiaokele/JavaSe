package javaSE01HelloWorld;

public class MathDemo {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(Math.abs(-1.2));
        System.out.println(Math.floor(3.14));
        System.out.println(Math.floor(-3.14));//返回小于等于参数的最小值
        System.out.println(Math.round(3.14));
        System.out.println("======================");
        //请使用 Math 相关的API，计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
        double c = -10.8;
        double b = 5.9;
        int count=0;
        for (double d =Math.ceil(c);d<b;d++){
            System.out.println(d);
            count++;
        }
        System.out.println("共有"+count);
    }
}
