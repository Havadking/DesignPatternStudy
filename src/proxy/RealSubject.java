package proxy;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-05 15:21
 **/

public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
