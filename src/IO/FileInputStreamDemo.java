package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        int len;

        while((len = fis.read())!=-1){
            System.out.println((char) len);
        }
        fis.close();
    }
}
