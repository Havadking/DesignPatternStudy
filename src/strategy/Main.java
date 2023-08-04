package strategy;

import strategy.ConcreteStrategyA;
import strategy.ConcreteStrategyB;
import strategy.ConcreteStrategyC;
import strategy.Context;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-04 12:00
 **/

@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
