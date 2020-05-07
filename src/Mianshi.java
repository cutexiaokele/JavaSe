public class Mianshi {
    public static void main(String[] args) {
        String s = "abc";
        String abc = new String("abc");
        String s2 = "abc";
        System.out.println(s == s2);
        System.out.println(s == abc);
    }
    private static int a = 1;
    static {
        System.out.println("123");
       int a =2 ;
        System.out.println(a);
    }




}
