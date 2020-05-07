package lambda;

import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        show(()->"你好");
        start(()-> System.out.println("你好啊"+Thread.currentThread().getName()));
        start(()-> System.out.println("你好啊"+Thread.currentThread().getName()));
    }

    private static void show(Message message) {
        System.out.println(message.getMessage());
    }

    public static void start(Runnable runnable){
        new Thread(runnable).start();
    }
    public static Comparator<String> getComparator(){
        return (o1,o2)->o1.length()-o2.length();
    }
}
