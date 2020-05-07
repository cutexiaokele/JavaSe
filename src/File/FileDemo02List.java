package File;

import java.io.File;
import java.io.FileFilter;

public class FileDemo02List {
    public static void main(String[] args) {
        File file1 = new File("D:\\");
        listFile(file1);
    }

    private static void listFile(File file) {
        File[] files = file.listFiles(pathname->(pathname.toString().toLowerCase().endsWith(".txt")||pathname.isDirectory()));
        for (File file2 : files) {
            if (file2.isDirectory()){
                if (file2.toString().endsWith(".BIN")){continue;};
                listFile(file2);
              //  System.out.println("目录"+file2.toString());

            }else {
                System.out.println(file2);
            }

            File file1 = new File("a.txt");
            file1.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    return false;
                }
            });
        }
    }
}
