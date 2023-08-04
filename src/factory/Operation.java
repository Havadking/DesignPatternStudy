package factory;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-04 14:13
 **/
@SuppressWarnings({"checkstyle:JavadocVariable", "checkstyle:MissingJavadocMethod"})
public class Operation {
    private double numberA = 0;
    private double numberB = 0;
    public double getResult() {
        double result = 0;
        return result;
    }
    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
