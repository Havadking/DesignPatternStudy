package strategy;

/**
 * @program: DesignPatternStudy
 * @description: 具体实现A
 * @author: Havad
 * @create: 2023-08-04 11:55
 **/

public class ConcreteStrategyA extends Strategy {

    @Override
    public void algorithmInterface() {
        System.out.println("算法A的实现");
    }
}
