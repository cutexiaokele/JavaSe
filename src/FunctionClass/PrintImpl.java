package FunctionClass;

public class PrintImpl {
    public static void main(String[] args) {
        print(name-> System.out.println(name));
        print(System.out::print);
    }

    private static void print(PrintInterface pi){
        pi.print("你好");
    }
}
