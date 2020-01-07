package principle.liskov.improve;

/**
 * @author Acyco
 * @create 2020-01-08 03:15
 */
public class Kiskov {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.fun1(11,3));
        System.out.println("1-8=" + a.fun1(1,8));
        System.out.println("------------------------");
        B b = new B();
        //因为B类不再继承A类，因此调用者，不会再用fun1是求减法
        System.out.println("11+3=" + b.fun1(11, 3));//这里本意是求出11+3
        System.out.println("1+8=" + b.fun1(1, 8)); //1+8
        System.out.println("11+3+9=" + b.fun2(11, 3));

        //使用组合仍然可以使用到A类的方法
        System.out.println("11-3=" + b.fun3(11,3));//这里本意是求出11-3
    }
}
//基类
class Base {

}
//A类
class A extends Base{
    public int fun1(int num1,int num2) {
        return num1 - num2;
    }
}

//B类
//增加了一个新功能： 完成两个数相加，然后和9求和
class B  extends Base {
    //如果B需要使用A类的方法，使用组合关系
    private A a = new A();
    //这里重写了A类的方法， 可能是无意识
    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return fun1(a, b)+9;
    }
//仍然想用A类的方法
    public int fun3(int a, int b) {
        return this.a.fun1(a, b);
    }
}

/*
    1 我们发现原来运行正常的相减功能发生了错误。原因就是类B无意中重写了父类的方法，造成原有的功能出现错误，在实际编程中，我们常常会
    重写父类的方法完成新的功能，这样写起来虽然简单，但在整个继承体系的利用性会比较差。 特别是运行多态比较频繁的时候。
    2 通用的做法是： 原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，我采用依赖，聚合，组合等关系来代替
 */