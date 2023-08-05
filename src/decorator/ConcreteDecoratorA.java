package decorator;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-05 14:28
 **/

public class ConcreteDecoratorA extends Decorator {
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State A";
        System.out.println("111");
        System.out.println("具体装饰对象A的操作" + addedState);
    }
}
