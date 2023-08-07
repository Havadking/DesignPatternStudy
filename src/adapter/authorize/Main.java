package adapter.authorize;

import adapter.inherit.PrintBanner;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-07 15:29
 **/

public class Main {
    public static void main(String[] args) {
        PrintBanner p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
