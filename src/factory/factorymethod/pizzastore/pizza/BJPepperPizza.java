package factory.factorymethod.pizzastore.pizza;

/**
 * 北京的胡椒披萨
 *
 * @author Acyco
 * @create 2020-01-10 00:07
 */
public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println("北京的胡椒Pizza 准备原材料");
    }
}
