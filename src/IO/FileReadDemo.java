package IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(new File("D:\\a.txt"));
        int len;
        char [] chars = new char[1024];
        while ((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }
}
