package Digui;

public class DiGui {
    public static void main(String[] args) {

        System.out.println(a(100));
    }

    private static int a(int i) {
        if (i==1){return 1;}

        i = i + a(--i);

        return i;
    }
}
