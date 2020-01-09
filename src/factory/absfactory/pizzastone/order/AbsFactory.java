package factory.absfactory.pizzastone.order;

import factory.absfactory.pizzastone.pizza.Pizza;

/**
 * @author Acyco
 * @create 2020-01-10 00:54
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);

}
