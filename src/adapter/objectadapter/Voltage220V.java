package adapter.objectadapter;

/**
 * @author Acyco
 * @create 2020-01-11 00:28
 */
public class Voltage220V {
    //输出220V的电压
    public int output220V() {
        int src = 220;
        System.out.println("电压= " + src +" 伏");
        return src;
    }

}
