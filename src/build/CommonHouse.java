package build;

/**
 * @author Acyco
 * @create 2020-01-10 03:21
 */
public class CommonHouse extends AbstractHose{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
