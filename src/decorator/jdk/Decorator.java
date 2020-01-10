package decorator.jdk;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Acyco
 * @create 2020-01-11 03:35
 */
public class Decorator {
    public static void main(String[] args) throws FileNotFoundException {
        //1. InputStream 是抽象类， 类似 Drink
        //2. FileInputStream 是 InputStream 子类  类似 DeCaf LongBlack
        //3. FilterInputStream 是 InputStream 子类 类似 Decorator 修饰者
        //4. DataInputStream 是 FilterInputStream 的子类  具体的修饰者 类似 Milk Soy等。。。
        //5. FilterInputStream 类 有 protected volatile InputStream in; 即含 被装饰者
        //6. 分析得出在jdk的io体系中 就是用了装饰者模式
        DataInputStream dis = new DataInputStream(new FileInputStream("f:\\abc.txt"));
    }
}
