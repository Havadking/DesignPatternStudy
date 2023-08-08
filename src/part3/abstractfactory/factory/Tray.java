package part3.abstractfactory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-08 11:50
 **/

public abstract class Tray extends Item {
    protected List<Item> tray = new ArrayList<>();

    public void add(Item item) {
        tray.add(item);
    }

    public Tray(String caption) {
        super(caption);
    }
}

