package factory.simplefactory.pizzastore.order;

/**
 * 相当于一个客户端，发出订购
 * @author Acyco
 * @create 2020-01-09 22:25
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza();
    }
}
/*
优点 是比较好理解，简单易操作
缺点是违反了设计模式的ocp原则， 即**对扩展开放，对修改关闭** 即当我们给类增加新功能的时候，尽量不要修改代码，或者尽可能少修改代码。
比如我们这时要新增加一个Piza的种类时。。。。

分析： 修改代码可以接受，但是如果 我们在其他的地方也有创建Pizza的代码，就意味关，也需要修改，而且创建Pizza的代码 **往往有多处**
思路： 把创建Pizza对象封闭到一个类中，这样我们有新的PIzza种类的时候，只需要修改该类就可以，其他有创建到PIzza对象的代码就不需要修改了，
----------->简单工厂模式

 */