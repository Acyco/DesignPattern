package factory.factorymethod.pizzastore.pizza;

/**
 * 伦敦的胡椒披萨
 *
 * @author Acyco
 * @create 2020-01-10 00:09
 */
public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println("伦敦的胡椒Pizza 准备原材料");
    }
}
