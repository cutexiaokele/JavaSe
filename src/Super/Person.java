package Super;

import java.util.function.Function;

public class Person extends Human {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void getMessage(FunctionInterface fi){
        fi.method();
    }

    public void sayHello2(){
        System.out.println("这是子类的方法");
    }

    public void show(){
        getMessage(()-> super.sayHello());
        getMessage(this::sayHello2);

    }
}
