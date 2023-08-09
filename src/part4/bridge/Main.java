package part4.bridge;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-09 16:50
 **/

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, world"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe"));
        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Random"));

        IncreaseDisplay d5 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 2);

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

        d4.randomDisplay(5);

        d5.increaseDisplay(5);
    }
}
