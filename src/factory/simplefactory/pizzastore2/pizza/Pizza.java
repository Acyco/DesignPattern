package factory.simplefactory.pizzastore2.pizza;

/**
 * @author Acyco
 * @create 2020-01-09 20:57
 */
public abstract class Pizza {
    protected String name;

    //准备原材料 不毛概课的披萨不一样，因此我们做成抽象方法

    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking;");
    }

    public void cut() {
        System.out.println(name + "cutting;");
    }

    public void box() {
        System.out.println(name + "boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }

}
