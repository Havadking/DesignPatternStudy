package part3.abstractfactory.listfactory;

import part3.abstractfactory.factory.Factory;
import part3.abstractfactory.factory.Link;
import part3.abstractfactory.factory.Page;
import part3.abstractfactory.factory.Tray;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-08 15:31
 **/

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
