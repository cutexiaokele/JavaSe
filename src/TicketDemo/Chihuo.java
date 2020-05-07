package TicketDemo;

public class Chihuo extends Thread{
    private BaoZi bz;

    public Chihuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag==false){
                    System.out.println("包子铺没包子");
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("开始吃包子");

                bz.flag=false;
                bz.notify();
            }
        }

    }
}
