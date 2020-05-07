package Super;

public class ConstratorDemo {
    public static void getPerson(String name,CreatePerson cp){
        Person person = cp.create(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        getPerson("迪丽热巴",name->new Person(name));

        getPerson("古力娜扎",Person::new);
    }
}
