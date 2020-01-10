package adapter.classadater;

/**
 * @author Acyco
 * @create 2020-01-11 00:33
 */
public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V,可以充电！~");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压超过5V,不能充电！");
        }
    }
}
