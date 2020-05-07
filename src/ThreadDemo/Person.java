package ThreadDemo;

public class Person extends Thread {
    private String names;
    private int age;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
         //  super.setName("狗但");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+i);

        }
    }


    public String getNames() {
        return names;
    }


    public void setNames(String name) {
        this.names = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
