package FunctionClass;

import java.util.function.Supplier;

public class MaxInArrayDemo {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1,2,3,4,5};

        Integer max1 = getMax(() -> {
            int max = 0;
            for (Integer integer : integers) {
                if (integer > max) {
                    max = integer;
                }
            }
            return max;
        });

        System.out.println("最大值就是"+max1);
    }

    public static Integer getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
