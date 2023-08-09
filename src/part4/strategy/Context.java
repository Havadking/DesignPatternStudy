package part4.strategy;

/**
 * @program: DesignPatternStudy
 * @description: 上下文
 * @author: Havad
 * @create: 2023-08-04 11:57
 **/

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文接口
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
