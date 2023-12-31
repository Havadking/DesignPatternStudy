package part2.factorymethod;

import part2.factorymethod.framework.Factory;
import part2.factorymethod.framework.Product;
import part2.factorymethod.idcard.IDCardFactory;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-07 14:14
 **/

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}
