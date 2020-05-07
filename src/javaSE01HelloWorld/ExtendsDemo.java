package javaSE01HelloWorld;

public class ExtendsDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.show();
    }
}
class Person{
    Person(){
        System.out.println("被戳实话了");
    }
    public void show(){
        System.out.println("人");
    }
}
class Dog extends Person{
    public void shows(){
        System.out.println("狗");
    }
}
