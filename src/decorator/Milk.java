package decorator;

/**
 * @author Acyco
 * @create 2020-01-11 03:11
 */
public class Milk extends Decoratro{
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
