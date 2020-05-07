package TicketDemo;

public class ColculatorDemo {
    public static void main(String[] args) {
        invoke(1,2,(a,b)->a+b);
    }
    private static void invoke(int a,int b,Colculator col){
        System.out.println(col.calc(a, b));
    }
}
