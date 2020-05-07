package Properties;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("迪丽热巴","18");
        properties.setProperty("古力娜扎","28");
        properties.setProperty("玛尔扎哈", "38");
        properties.store(new FileWriter(new File("D:\\a.txt")),"saveName");

    }
}
