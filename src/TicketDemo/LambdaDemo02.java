package TicketDemo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo02 {
    public static void main(String[] args) {
        Person[] per ={new Person("古力娜扎",18),new Person("柳岩",28),new Person("迪丽热巴",19)};
        Arrays.sort(per, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        Arrays.sort(per,(Person p1,Person p2)->{return p1.getAge()-p2.getAge();});
        for (Person person : per) {
            System.out.println(person);
        }
    }
}
