package build;

/**
 * @author Acyco
 * @create 2020-01-10 03:22
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
/*
优点是比较好理解 简单易操作
设计的程序结构,过于简单，没有设计缓存层对象，程序的扩展和维护不好。也就是说，这种设计方案
把产品（即：房子）和 创建产品的过程（即：建房子的流程）封装在一起，耦合性增强了。
解决方案：将产品和产品建造过程解耦 => 建造者模式
 */