package factory.factorymethod.pizzastore.pizza;

/**
 * 伦敦奶酪披萨
 *
 * @author Acyco
 * @create 2020-01-10 00:11
 */
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println("伦敦的奶酪Pizza 准备原材料");
    }
}
