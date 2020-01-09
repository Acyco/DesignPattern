package factory.simplefactory.pizzastore2.order;

/**
 * 相当于一个客户端，发出订购
 * @author Acyco
 * @create 2020-01-09 22:25
 */
public class PizzaStore {
    public static void main(String[] args) {

        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序 ");
    }
}
/*

 */