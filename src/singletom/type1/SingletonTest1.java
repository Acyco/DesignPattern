package singletom.type1;

/**
 * 饿汉式（静态变量）
 *
 * @author Acyco
 * @create 2020-01-08 00:20
 */
public class SingletonTest1 {
    //构造器私有化 外部不能new
    public static void main(String[] args) {

    }

    static class Singleton{
        private Singleton() {

        }
        private final static Singleton instance = new Singleton();

        public static Singleton getInstance() {
            return instance;
        }
    }
}
/*

 */