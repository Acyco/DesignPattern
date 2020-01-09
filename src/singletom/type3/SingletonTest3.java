package singletom.type3;

/**
 * @author Acyco
 * @create 2020-01-08 09:04
 */
public class SingletonTest3 {
    public static void main(String[] args) {
        System.out.println("懒汉式1，线程不安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); //true
        System.out.println("instance.hashcode="+instance.hashCode());
        System.out.println("instance2.hashcode="+instance2.hashCode());
    }
}

class Singleton {
    private static Singleton instance;

    private Singleton(){}

    //提供一个静态的公有的方法，当使用到该方法时，才去创建instance 即懒汉式
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}

/*
优缺点
起来到了Lazy Loading的效果，但是只能在单线程使用
如果在多线程，一个线程进入了if()(instance == null) 判断语句块,还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
所以在多线程环境下不可使用这种方式
结论： 在实际开发中，不要使用这种方式。
 */