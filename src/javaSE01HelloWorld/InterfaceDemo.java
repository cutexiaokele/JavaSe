package javaSE01HelloWorld;

public class InterfaceDemo {
    public static void main(String[] args) {
        new Computer().useComputer(new Mouse());
    }
}
interface Usb{
    void open();
    void close();
}

class Mouse implements Usb{

    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void useMouse(){
        System.out.println("鼠标点击了一下");
    }
}

class Computer{

    public void useComputer(Usb usb){
        if (usb!=null){
            if (usb instanceof Mouse){
                Mouse mouse= (Mouse) usb;
                mouse.useMouse();
            }
        }
    }
}
