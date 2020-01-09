package factory.absfactory.pizzastone.order;

/**
 * @author Acyco
 * @create 2020-01-10 01:09
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }
}
