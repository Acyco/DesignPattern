package factory.factorymethod.pizzastore.order;


import factory.factorymethod.pizzastore.pizza.*;

/**
 * @author Acyco
 * @create 2020-01-10 00:21
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
           pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
