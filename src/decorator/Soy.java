package decorator;

/**
 * @author Acyco
 * @create 2020-01-11 03:12
 */
public class Soy extends Decoratro{
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
