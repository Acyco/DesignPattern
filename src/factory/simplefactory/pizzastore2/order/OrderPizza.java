package factory.simplefactory.pizzastore2.order;

import factory.simplefactory.pizzastore2.pizza.CheesePizza;
import factory.simplefactory.pizzastore2.pizza.GreekPizza;
import factory.simplefactory.pizzastore2.pizza.PepperPizza;
import factory.simplefactory.pizzastore2.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Acyco
 * @create 2020-01-09 22:13
 */
public class OrderPizza {
    /*   public OrderPizza() {
           Pizza pizza = null;
           String orderType;
           do {
               orderType = getType();

               //输出制作过程
               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();
           } while (true);
       }
   */
    //定义一个简单工厂对象
    SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType ="";
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            Pizza pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null) {  //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }

        } while (true);


    }
    //写一个方法，可以获取客户希望订购的披萨种类
    public String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入披萨种类: ");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
