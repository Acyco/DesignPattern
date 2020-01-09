package singletom.type7;

/**
 * 静态内部类
 * @author Acyco
 * @create 2020-01-09 20:01
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
        System.out.println("instance.hashcode=" + instance.hashCode());
        System.out.println("instance2.hashcode=" + instance2.hashCode());
    }
}


class Singleton {
    //构造器私有化
    private Singleton() {

    }

    //写一个静态内部类，该类中一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton INSTACE = new Singleton();
    }

   //提供一个静态的公有方法；
    public static Singleton getInstance() {
        return SingletonInstance.INSTACE;
    }
}
/*
这种方式采用了类装载的机制来保证初始化实例时只有一个线程
静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstace方法，才会装载SingletonInstace类，从而完成Singletom实例化
类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
优点： 避免了**线程不安全**，利用静态内部类特点实现延迟加载，效率高
结论，推荐使用
 */