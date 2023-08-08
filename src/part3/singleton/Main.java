package part3.singleton;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-08 09:36
 **/

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        if (singleton1 == singleton2) {
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
        System.out.println("End.");
    }
}
