package javaSE01HelloWorld;

public class SystemArrayCopy {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,4,5};
        int[] b ={3,3,3,4,4,5};
        System.arraycopy(a,0,b,0,3);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
