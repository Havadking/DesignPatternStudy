package part4.bridge;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-09 16:27
 **/

public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public final void display() {
        open();
        print();
        close();
    }

    public void close() {
        impl.rawClose();
    }

    public void print() {
        impl.rawPrint();
    }

    public void open() {
        impl.rawOpen();
    }


}
