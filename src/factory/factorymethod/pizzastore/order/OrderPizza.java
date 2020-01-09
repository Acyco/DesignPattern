package factory.factorymethod.pizzastore.order;

import factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Acyco
 * @create 2020-01-09 22:13
 */
public abstract class OrderPizza {
    //定义一个抽象方法 createPizza 让各个工厂子类自己实现
    public abstract Pizza createPizza(String orderType);
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;//订购披萨的类型
        do {
            orderType = getType();
         pizza =  createPizza(orderType);//抽象方法，由工厂子类 完成

            //输出制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    //写一个方法，可以获取客户希望订购的披萨种类
    public String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(" 输入披萨种类: ");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
