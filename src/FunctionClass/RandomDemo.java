package FunctionClass;

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {
    public static void test(int a){
        boolean[] bool = new boolean[a];
        ArrayList list = new ArrayList();
        int i1 ;
        for (int i = 0; i < a; i++) {
            Random r = new Random();
            do {
               i1 = r.nextInt(a);
            }while (bool[i1]);
            bool[i1]=true;
            list.add(i1);
        }
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        test(10);
    }
}
