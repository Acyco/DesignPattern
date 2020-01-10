package bridge;

/**
 * @author Acyco
 * @create 2020-01-11 01:52
 */
// 折叠式手机类 继承抽象类 Phone
public class FoldedPhone extends Phone{
    //构造器
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
