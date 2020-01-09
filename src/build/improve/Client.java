package build.improve;

/**
 * @author Acyco
 * @create 2020-01-10 04:07
 */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        final CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        //完成盖房子，返回产品（房子）

        House house = houseDirector.constructHouse();

        //System.out.println("输出流程");
        System.out.println("+++++++++++++++++++++++++++++++");
        //盖高楼
        HighBuiding highBuiding = new HighBuiding();

        //重置建造者
        houseDirector.setHouseBuilder(highBuiding);

        //完成盖房子， 返回产品（高楼）

        House house1 = houseDirector.constructHouse();

    }
}
