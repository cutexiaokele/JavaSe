package TicketDemo;

public class PrintWorldDemo {
    public static void main(String[] args) {
        print("ww",a->{
            System.out.println(a);
        });
    }
    private static void print(String world,PrinWorld pr){
        pr.print(world);
    }

    //注意事项 lambda省略  如果只有一个参数列表，那么（）和 数据类型都可以胜率，如果重写方法体只有一行那么{} ； 和 return都可以胜率，如果有两个参数列表，那么参数类型可以胜率
}
