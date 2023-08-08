package part3.abstractfactory.listfactory;

import part3.abstractfactory.factory.Link;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-08 15:32
 **/

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <i><a href=\"" + url + "\"›" + caption + "</a></li>\n";
    }
}
