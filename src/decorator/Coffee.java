package decorator;

/**
 * @author Acyco
 * @create 2020-01-11 03:00
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
