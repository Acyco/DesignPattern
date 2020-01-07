package principle.singleresponsibility;

/**
 * @author Acyco
 * @create 2020-01-08 00:49
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }


}

/**
 * 交通工具类
 * 方式一
 * run方法中 违反了单一职责原则
 * 解决的方案 根据交通运行方法不同，分解成不同类即可
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行。。。。");
    }
}