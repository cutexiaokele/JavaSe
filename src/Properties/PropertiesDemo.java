package Properties;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties pro = new Properties();
        pro.setProperty("a","123");
        pro.setProperty("a","123");
        pro.setProperty("a","123");
        Set<String> strings = pro.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
