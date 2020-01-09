package factory.simplefactory.pizzastore.pizza;

/**
 * @author Acyco
 * @create 2020-01-09 21:04
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}
