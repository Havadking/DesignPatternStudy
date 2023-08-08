package part3.abstractfactory;

import part3.abstractfactory.factory.Factory;
import part3.abstractfactory.factory.Link;
import part3.abstractfactory.factory.Page;
import part3.abstractfactory.factory.Tray;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-08 15:29
 **/

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("listfactory.ListFactory");
        Link people = factory.createLink("人民日报", "www.people.com");
        Link light = factory.createLink("光明日报", "www.gmw.cn");
        Link yahoo = factory.createLink("Yahoo!", "www.yahoo.com");
        Link google = factory.createLink("google", "www.google.com");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(light);

        Tray traySearch = factory.createTray("搜索引擎");
        traySearch.add(yahoo);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "Havad");
        page.add(trayNews);
        page.add(traySearch);

        page.output();
    }
}
