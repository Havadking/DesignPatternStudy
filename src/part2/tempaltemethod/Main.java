package part2.tempaltemethod;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-07 11:35
 **/

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world");
        AbstractDisplay d3 = new StringDisplay("你好，世界");

        d1.display();
        d2.display();
        d3.display();
    }
}
