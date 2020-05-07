package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = null;
        File file = new File("D:\\a.txt");
        byte[] bytes = "nihao woshda".getBytes();
        file.createNewFile();

        try {

            fileOutputStream = new FileOutputStream(new File("D:\\a.txt"));
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
