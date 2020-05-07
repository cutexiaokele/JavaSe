package IO;

import java.io.*;

public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:" + File.separator + "1.jpg");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream("D:"+File.separator+"3.jpg");
        int len;
        byte[] bytes=new byte[1024];
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
            fos.flush();
        }
        fos.close();
        fos.close();

    }
}
