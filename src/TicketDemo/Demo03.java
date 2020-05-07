package TicketDemo;

public class Demo03 {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
            while (true){
                synchronized (obj){
                    System.out.println("你好，老板，我要包子");

                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("开始吃包子");
                    obj.notify();
                }
            }


            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("开始生产包子，生产了一个包子");
                        try {
                            obj.notify();
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }

                }


        }.start();
    }
}
