package IO.buffered;

import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis = new FileOutputStream("D:\\a.txt");
        BufferedOutputStream bis = new BufferedOutputStream(fis);
        bis.write("你好，这是缓冲流写入的".getBytes());
        bis.flush();
        bis.close();

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\a.txt",true),1024);
        bos.write("你好，这是什么事吗".getBytes());
        bos.flush();
        bos.close();

        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer append = stringBuffer.append("1122aaa").append("aaa");
        int a = append.indexOf("a");
        System.out.println(a);
    }
}
