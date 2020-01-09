package factory.simplefactory.pizzastore.pizza;

import factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @author Acyco
 * @create 2020-01-09 21:03
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备原材料");
    }
}
