package factory.simplefactory.pizzastore2.order;

import factory.simplefactory.pizzastore2.pizza.CheesePizza;
import factory.simplefactory.pizzastore2.pizza.GreekPizza;
import factory.simplefactory.pizzastore2.pizza.PepperPizza;
import factory.simplefactory.pizzastore2.pizza.Pizza;

/**
 * 简单工厂类
 * @author Acyco
 * @create 2020-01-09 22:59
 */

public class SimpleFactory {

    //根据orderType 返回对应的Pizz 对象;
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

    //简单工厂模式也叫静态工厂模式

}
