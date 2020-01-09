package factory.factorymethod.pizzastore.pizza;

/**
 * 北京奶酪披萨
 *
 * @author Acyco
 * @create 2020-01-10 00:04
 */
public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println("北京的奶酪Pizza 准备原材料");
    }
}
