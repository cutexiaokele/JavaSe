package File;

import java.io.File;

public class FileDemo01Separtor {
    public static void main(String[] args) {

        System.out.println(File.separator); //文件分隔符
        System.out.println(File.pathSeparator);//；路径改分隔符
        File file = new File("d:\\", "a.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(new File(new File("d:\\a\\").getParent()));
        //directory file path  isDirectory
        boolean delete = file.delete();
        System.out.println("已经删除了吗"+delete);
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);
    }
}
