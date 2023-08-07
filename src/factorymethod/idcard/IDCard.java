package factorymethod.idcard;

import factorymethod.framework.Product;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-07 11:57
 **/

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        this.owner = owner;
        System.out.println("制作" + owner + "的ID卡。");
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡。");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
