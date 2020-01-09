package singletom.type4;

/**
 * 懒汉式（线程安全，同步方法）
 *
 * @author Acyco
 * @create 2020-01-08 09:20
 */
public class SingletomTest4 {
    public static void main(String[] args) {
        System.out.println("懒汉式2，线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
        System.out.println("instance.hashcode=" + instance.hashCode());
        System.out.println("instance2.hashcode=" + instance2.hashCode());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //提供一个静态的公有的方法，加入了同步处理的代码，解决了线程安全
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
/*
解决了线程不安全的问题
效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。 而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，
直接return就行了，方法进行同步效率太低。
结论： 在实际开发中，不推荐使用这种方式
 */