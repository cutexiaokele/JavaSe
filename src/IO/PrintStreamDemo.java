package IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\a.txt");
        ps.print(97);
        ps.write(97);
        ps.close();
    }
}
