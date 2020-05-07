package IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter(new File("D:\\a.txt"),true);
        fw.write("你好啊!!!!!!");
        fw.write("\r\n");
        fw.write("你好啊!!!!!!");
        fw.close();
    }
}
