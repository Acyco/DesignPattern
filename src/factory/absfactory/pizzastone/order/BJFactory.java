package factory.absfactory.pizzastone.order;

import factory.absfactory.pizzastone.pizza.BJCheesePizza;
import factory.absfactory.pizzastone.pizza.BJPepperPizza;
import factory.absfactory.pizzastone.pizza.Pizza;

/**
 * @author Acyco
 * @create 2020-01-10 00:55
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper"))
            pizza = new BJPepperPizza();
        return pizza;
    }
}
