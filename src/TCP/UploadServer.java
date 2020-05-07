package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        FileOutputStream fos = new FileOutputStream(new File("D:\\2.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        OutputStream os = s.getOutputStream();
        os.write("上传完毕".getBytes());
        s.close();
        fos.close();
    }
}
