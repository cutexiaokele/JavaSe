package IO.buffered;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\a.txt", true));
        bw.newLine();
        bw.write("2019.05.04");
        bw.flush();
        bw.close();
        long e = System.currentTimeMillis();
        System.out.println("一共用了"+(e-s)+"毫秒");
        BufferedReader br = new BufferedReader(new FileReader("D:\\a.txt"));
        String len;
        while ((len=br.readLine())!=null){
            System.out.println(len);
        }

        // BufferReader(new FileReader(new File()))  方法  readLine ()读取一行 返回String  判断是否为空
        //BufferWriter(new FileWrite(new File()))  newLine 换行       字符缓冲流
    }
}
