package singletom.type6;

/**
 * 双重检查
 * @author Acyco
 * @create 2020-01-09 19:48
 */
public class SingletonTest6 {
    public static void main(String[] args) {
        System.out.println("双重检测");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
        System.out.println("instance.hashcode=" + instance.hashCode());
        System.out.println("instance2.hashcode=" + instance2.hashCode());
    }
}

// 懒汉式 线程安全
class Singleton {
    private static volatile Singleton instance;

    private Singleton() {

    }
//提供一个静态的公共方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
// 同时保证了效率， 推荐使用
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
/*
Double-Check 概念是多线程开发中常使用到的，如上面代码所示，我们进行了两次if(instance == null)检查，这样就可以保证线程安全了，
这样，实例化代码只用执行一次，后面再次访问时，判断if(instance == null), 直接return实例化对象，也避免的反复进行方法同步，
线程安全，延迟加载，效率较高，
结论： 在实际开发中，推荐也使用这种单例设计模式
 */