package Super;

import java.util.Arrays;

public class ArrayBuilderDemo {
    public static void main(String[] args) {
       ArrayBuilderMethod(10,len->new String[len]);
       ArrayBuilderMethod(10,String[]::new);
    }
    public static void ArrayBuilderMethod(int length,ArrayBuilder ab){
        String[] builder = ab.builder(length);
        System.out.println(builder.length);

    }
}
