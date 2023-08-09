package part4.bridge;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-09 16:45
 **/

public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }
}
