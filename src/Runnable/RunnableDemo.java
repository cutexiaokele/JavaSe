package Runnable;

public class RunnableDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }).start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
