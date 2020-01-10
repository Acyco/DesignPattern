package adapter.classadater;

/**
 * @author Acyco
 * @create 2020-01-11 00:31
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        //获取到220电压
        int srcV = output220V();
        return srcV/44; //转成5V

    }
}
