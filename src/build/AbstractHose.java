package build;

/**
 * @author Acyco
 * @create 2020-01-10 03:18
 */
public abstract class AbstractHose {

    //打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
