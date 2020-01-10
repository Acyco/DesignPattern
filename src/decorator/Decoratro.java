package decorator;

/**
 * @author Acyco
 * @create 2020-01-11 03:04
 */
public class Decoratro extends Drink{
    private Drink obj;

    public Decoratro(Drink obj) { //组合关系
        this.obj = obj;
    }

    @Override
    public float cost() {
        //getPrice(自己的价格)
        return super.getPrice() + obj.cost() ;
    }

    @Override
    public String getDes() {
        //obj.getDes 输出被装饰者的信息
        return des +" " + getPrice()+ " && " + obj.getDes();
    }
}
