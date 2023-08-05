package decorator;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-05 14:24
 **/

public class ConcreteComponent implements Component {
    /**
     * operation
     */
    @Override
    public void operation() {
        System.out.println("对象的具体操作");
    }
}
