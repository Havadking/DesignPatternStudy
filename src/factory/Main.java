package factory;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-04 14:26
 **/

@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
public class Main {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate("+");
        operation.setNumberA(1);
        operation.setNumberB(2);
        System.out.println(operation.getResult());
    }
}
