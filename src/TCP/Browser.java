package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Browser {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        String path = s1[1].substring(1);
        System.out.println(path);
        System.out.println("啧啧啧");
        FileInputStream fis = new FileInputStream("D:\\javawork\\javaSE\\web\\index.html");
        OutputStream os = socket.getOutputStream();
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("content-type: text/html\r\n".getBytes());
        os.write("\r\n".getBytes());
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes))!=-1){
        os.write(bytes,0,len);
        }

    }
}
