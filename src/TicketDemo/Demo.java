package TicketDemo;

public class Demo {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        new Baozipu(baoZi).start();
        new Chihuo(baoZi).start();

    }
}
