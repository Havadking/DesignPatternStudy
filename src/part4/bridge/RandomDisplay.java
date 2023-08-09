package part4.bridge;

import java.util.Random;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-09 16:59
 **/

public class RandomDisplay extends Display{
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        open();
        Random random = new Random();
        int num = random.nextInt(times + 1);
        for (int i = 0; i < num; i++) {
            print();
        }
        close();
    }
}
