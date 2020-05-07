package TicketDemo;

public class Demo01 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            sale();
        }
    }

    private synchronized void sale() {
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket--);
        }
    }
}
