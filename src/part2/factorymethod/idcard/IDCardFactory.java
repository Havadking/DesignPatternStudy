package part2.factorymethod.idcard;

import part2.factorymethod.framework.Factory;
import part2.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-07 11:59
 **/

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }
}
