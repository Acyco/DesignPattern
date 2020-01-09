package build.improve;

/**
 * @author Acyco
 * @create 2020-01-10 03:58
 */
public class CommonHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基 3米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙 10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
