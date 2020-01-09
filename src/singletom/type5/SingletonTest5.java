package singletom.type5;

/**
 * 懒汉式（
 * @author Acyco
 * @create 2020-01-08 09:38
 */
public class SingletonTest5 {
}


class Singleton {
    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                singleton= new Singleton();
            }
        }
        return singleton;
    }
}
/*
这种方式。本意是想对第四种实现方法的改进，因为前面同步方法效率太低，改为同步产生实例化的代码块。
但是这种同步并不能直到线程同步的作用， 跟第三种实现方式遇到的情形一致，假如一个线程进入了if(singleton ==null)判断 语句块
还未来得及往下执行，另一个线程也通过了这个判断 语句，这时便会产生多个实例。
结论： 在实际开发中，不能使用这种方式。
 */