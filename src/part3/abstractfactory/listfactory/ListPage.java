package part3.abstractfactory.listfactory;

import part3.abstractfactory.factory.Item;
import part3.abstractfactory.factory.Page;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-08 15:40
 **/

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<html><head><title›").append(title).append("</title></head>\n");
        builder.append ("<body> \n");
        builder.append("<h1›").append(title).append("</h1>\n");
        builder.append ( "<ul>\n" ) ;
        for (Item item : content) {
            builder.append(item.makeHTML());
        }
        builder.append ("</ul>\n");
        builder.append("<hr›<address›").append(author).append("</address>");
        builder.append("</body></html>\n");
        return builder.toString () ;
    }
}
