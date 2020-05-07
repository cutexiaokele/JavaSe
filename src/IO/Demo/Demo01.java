package IO.Demo;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("D:\\a.txt")));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D:\\b.txt")));
        HashMap<Object,Object> map = new HashMap<>();
        String len;
        while ((len=br.readLine())!=null){
            String[] arr = len.split("\\.");
            System.out.println(arr[0]+arr[1]);
            map.put(arr[0]+"",arr[1]);
        }
        br.close();

        Set<Object> strings = map.keySet();
        for (Object string : strings) {
            System.out.println(string);
        }
//        for (Object string : strings) {
//            String value = map.get(string);
//            bw.write(string+"."+value);
//            bw.newLine();
//            bw.flush();
//        }

        bw.close();

    }
}
