package singletom.type2;

/**
 * 饿汉式（静态变量）
 *
 * @author Acyco
 * @create 2020-01-08 00:20
 */
public class SingletonTest2 {

    public static void main(String[] args) {

        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
        System.out.println("instance.hashcode="+instance.hashCode());
        System.out.println("instance2.hashcode="+instance2.hashCode());
    }


}


class Singleton {
    //1. 构造器私有化 外部不能new
    private Singleton() {

    }

    //2. 本类内部使用创建对象实例
    private final static Singleton instance = new Singleton();

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
/*
优缺点
优点： 这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
缺点： 在类装载的时候就完成实例化。没有达到Lazy Loading的效果。 如果从始至终从未使用过这个实例，则会造成内存浪费。
    这种方式基于classload机制避免了多线程同步问题，不过，instance在类装载时就实例化，在单例模式中大多数都是调用getInstance方法，但是
    导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化没有达到lazy loading的效果。
结论： 这种单例模式可用，可能造成内存浪费。
 */