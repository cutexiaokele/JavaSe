package IO;

import IO.Demo.Person;

import java.io.*;

public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\person.txt"));
        oos.writeObject(new Person("张三",18));
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:\\person.txt")));
        Object o = ois.readObject();
        System.out.println(o);
    }
}
