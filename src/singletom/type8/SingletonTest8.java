package singletom.type8;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author Acyco
 * @create 2020-01-09 20:15
 */
public class SingletonTest8 {
    public static void main(String[] args) {

        Singleton instace = Singleton.INSTANCE;
        Singleton instace2 = Singleton.INSTANCE;
        System.out.println(instace == instace2);
        System.out.println(instace.hashCode());
        System.out.println(instace2.hashCode());

        instace.say();
        instace2.say();
    }
}

//使用枚举
enum Singleton {
    INSTANCE; //属性

    public void say() {
        System.out.println("Ok");
    }
}
/*
这借助JDK1.5中添加的枚举实现单例模式。不公能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
这种方式是Effective Java作者Josh Bloch提倡的方式。
结论：推荐使用

 */