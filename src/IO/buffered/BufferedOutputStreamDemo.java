package IO.buffered;



import java.io.*;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //字节缓冲输入流
        FileInputStream fis = new FileInputStream("D:\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len;
        byte[] bytes = new byte[1024];
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();

        FileWriter fileWriter = new FileWriter("d:\\1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\1.txt"));
        bos.write("sdasd".getBytes());
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\1.txt"));
        bufferedWriter.newLine();



    }
}
