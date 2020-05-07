package IO;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        File file = new File("D:" + File.separator + "a.txt");
        if (file.exists()){
            file.delete();
        }
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("唉，你好".getBytes());
        fos.flush();
        fos.close();
        FileInputStream fis = new FileInputStream(file);
        int len;
        byte[] bytes = new byte[1024];
        while((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
