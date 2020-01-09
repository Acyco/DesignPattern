package factory.simplefactory.pizzastore3.order;

import factory.simplefactory.pizzastore3.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Acyco
 * @create 2020-01-09 22:13
 */
public class OrderPizza {
    Pizza pizza = null;
    String orderType = "";
      public OrderPizza() {

           do {
               orderType = getType();
              pizza =  SimpleFactory.createPizza(orderType);//直接调用静态方法
               //输出制作过程
               if (pizza != null) {
                   pizza.prepare();
                   pizza.bake();
                   pizza.cut();
                   pizza.box();
               }else {
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
