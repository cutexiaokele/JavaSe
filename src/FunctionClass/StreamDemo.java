package FunctionClass;

        import java.util.*;
        import java.util.stream.Stream;

public class StreamDemo {
    //stream流方式操作集合
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("王五");
        list.add("张三风");

        Stream<String> stream = list.stream();
        stream.filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));

        Stream.of("a","b","c").forEach(name-> System.out.println(name));

        String[] strings = new String[]{"abc","bcd","efg"};
        Stream.of(strings).forEach(s-> System.out.println(s));

        Map<String,String> map = new HashMap<>();
        Set<String> strings1 = map.keySet();
        Stream<String> stream1 = strings1.stream();

        Collection<String> values = map.values();
        Stream<String> stream2 = values.stream();

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
        }

        System.out.println(new Random(1024).nextInt());

        boolean[] bool = new boolean[10];
        bool[9]=true;
        System.out.println(bool[9]);
    }
}
