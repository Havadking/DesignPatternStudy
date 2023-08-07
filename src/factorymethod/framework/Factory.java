package factorymethod.framework;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-07 11:54
 **/

public abstract class Factory {
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}
