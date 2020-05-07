package IO.Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("D:\\a.txt")));
        HashMap<String, String> map = new HashMap<>();
        String len = null;
//        while ((len= br.readLine())!=null){
//            String[] arr = len.split("\\.");
//            map.put(arr[0],"aaa");
//            System.out.println(arr[0]);
//        }
        for (int i = 0; i < 3; i++) {
            map.put(-i+"","aaaaaa");
        }
        map.put("10","sdas");
        map.put("0","sdas");
        br.close();
        Set<String> strings = map.keySet();
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
