package adapter.objectadapter;

/**
 * @author Acyco
 * @create 2020-01-11 00:52
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V; //关联关系： 聚合

    //通过构造器，传入一个 Voltage220V 的实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (null != voltage220V) {
            //获取到220电压
            int srcV = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配~~");
            dstV = srcV / 44;//转成5V
            System.out.println("适配完成，输出的电压=" + dstV);
        }
        return dstV;
    }
}
