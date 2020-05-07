package javaSE02Collection;

public class ExvetionDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1111");
                System.out.println(Thread.currentThread().getName());
            }
      }).start();
    }
}
