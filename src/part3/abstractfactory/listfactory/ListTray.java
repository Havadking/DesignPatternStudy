package part3.abstractfactory.listfactory;

import part3.abstractfactory.factory.Item;
import part3.abstractfactory.factory.Tray;

import java.util.Iterator;
import java.util.List;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-08 15:34
 **/

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append ("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append ("<ul>\n");
        for (Item item : tray) {
            buffer.append(item.makeHTML());
        }
        buffer.append ("</ul>\n");
        buffer.append ("</li>\n");
        return buffer.toString ();
    }
}
