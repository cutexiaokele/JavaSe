package TicketDemo;

public class Baozipu extends Thread{
    private BaoZi bz;
    private int count=0;

    public Baozipu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if (bz.flag==true){
                    System.out.println("包子铺有包子，可以开始吃了");
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("包子铺开始生产包子");
                if (count % 2==0){
                    System.out.println("开始生产猪肉包");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count++;
                }else {

                    System.out.println("开始生产豆沙包"); try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count++;
                }
                bz.flag=true;
                bz.notify();


            }
        }


    }
}
