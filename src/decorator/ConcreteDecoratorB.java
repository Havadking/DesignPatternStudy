package decorator;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-05 14:28
 **/

public class ConcreteDecoratorB extends Decorator {
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State B";
        System.out.println("222");
        System.out.println("具体装饰对象B的操作" + addedState);
    }
}
