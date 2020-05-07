package FunctionClass;

import TicketDemo.Person;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("张三");
        list.add("lisi");
        list.add("王五");
        list.add("张无忌");
        ArrayList<String> list1 = new ArrayList();
        list1.add("王三");
        list1.add("李思思");
        list1.add("赵思敏");
        list1.add("张思");
        list1.add("张三");
        list1.add("张3");
        Stream<String> team1 = list.stream().filter(name -> name.length() == 3).limit(3);
        Stream<String> team2 = list1.stream().filter(name -> name.startsWith("张")).skip(2);
        Stream<String> team = Stream.concat(team1, team2);
        team.map(name->new Person(name,18)).forEach(person -> System.out.println(person));
    }
}
