package IO.Demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo04 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File("D:\\e.txt")), "GBK");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
