package IO.Demo;

import java.util.HashMap;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("1","a");
        map.put("3","a");
        map.put("2","a");
        Set<Object> objects = map.keySet();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
