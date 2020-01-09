package prototype;

/**
 * @author Acyco
 * @create 2020-01-10 01:43
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");

        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep6 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        // .....

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        System.out.println(sheep6);
    }
}
/*
传统的方式优缺点
优点： 比较好理解 简单易操作
在创建新的对象时，总是需要重新获取原始资源对象的属性，如果 创建的对象比较复杂时，效率较低。
总是需要重新初始化对象，而不是动态地获得对象运行时的状态， 不够灵活。
思路： java中Object类是所有类的根类，Object类提供了一个clone（）方法，该方法可以将一个java对象复制一份，但是需要实现clone的java类必须 要实现一个接口
Cloneable,该接口表示该类能够复制且有复制能力 =》 原型模式

 */