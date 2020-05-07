package javaSE01HelloWorld;

public class Conversion {
    public static void main(String[] args) {
        String s = "abcdef";
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        byte[] bytes = s.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        s.replace("a","b");
        s.replace("/wd","1");
        String[] ds = s.split("d");
        for (String d : ds) {
            System.out.println(d);
        }
    }
}
