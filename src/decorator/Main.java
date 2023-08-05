package decorator;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-05 14:32
 **/

public class Main {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();
        a.setComponent(component);
        b.setComponent(a);
        b.operation();
    }
}
