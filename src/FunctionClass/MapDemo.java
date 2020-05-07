package FunctionClass;

import java.util.*;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> maps = new HashMap<>();
        maps.put("熊大","黑白");
        maps.put("熊二","傻白");
        maps.put("光头强","光头");
        //第一种方式通过遍历key
        Set<String> keySet = maps.keySet();
        for (String s : keySet) {
            System.out.println(s+":"+maps.get(s));
        }
        //第二种通过遍历value
        Collection<String> values = maps.values();
        for (String value : values) {
            System.out.println(value);
        }

        //通过entrySet
        Set<Map.Entry<String, String>> entries = maps.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("=========================");
        Iterator<Map.Entry<String, String>> iterator = maps.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Stream<String> stream = maps.keySet().stream();
        Stream<String> stream2 = maps.keySet().stream();
        Stream<String> concat = Stream.concat(stream, stream2);
        concat.forEach(name-> System.out.println(name));

        ArrayList list = new ArrayList();
        list.add("你好");
        ArrayList list2 = new ArrayList();
        list2.add("我不好");
        ArrayList list3 = new ArrayList();
        list3.addAll(list);
        list3.addAll(list2);
        System.out.println(list3.toString());
         list2.addAll(list);
        System.out.println(list2.toString());
    }
}
