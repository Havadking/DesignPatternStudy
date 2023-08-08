package part3.builder;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-08 10:33
 **/

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("form morning to afternoon");
        builder.makeItems(new String[]{
                "good morning",
                "good afternoon",
        });
        builder.makeString("evening");
        builder.makeItems(new String[]{
                "good evening",
                "good night",
                "good bye",
        });
        builder.close();
    }
}
