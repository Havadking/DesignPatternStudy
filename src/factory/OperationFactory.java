package factory;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-04 14:23
 **/

@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
public class OperationFactory {
    @SuppressWarnings("checkstyle:MissingJavadocMethod")
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+" -> operation = new OperationAdd();
            case "-" -> operation = new OperationSub();
            default -> {
            }
        }
        return operation;
    }
}
