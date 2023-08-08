package part3.prototype;

import java.util.HashMap;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-07 10:09
 **/

public class Manager {
    private HashMap<String, Product> showCase = new HashMap<>();

    public void register(String name, Product proto) {
        showCase.put(name, proto);
    }

    public Product create(String protoName) {
        Product product = showCase.get(protoName);
        return product.createClone();
    }
}
