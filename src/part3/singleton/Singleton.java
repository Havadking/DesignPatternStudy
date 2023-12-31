package part3.singleton;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-08 09:30
 **/

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("生成了一个实例");
    }
    public static Singleton getSingleton() {
        return singleton;
    }
}
