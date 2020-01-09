package factory.absfactory.pizzastone.order;

import factory.absfactory.pizzastone.pizza.LDCheesePizza;
import factory.absfactory.pizzastone.pizza.LDPepperPizza;
import factory.absfactory.pizzastone.pizza.Pizza;

/**
 * @author Acyco
 * @create 2020-01-10 00:58
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper"))
            pizza = new LDPepperPizza();
        return pizza;
    }
}
