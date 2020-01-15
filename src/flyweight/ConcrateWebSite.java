package flyweight;

/**
 * @author Acyco
 * @create 2020-01-13 19:56
 */
public class ConcrateWebSite extends WebSite {
    private String type = "";//网站发布的形式

    public ConcrateWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为" + type + " 在使用中。。使用者是"+user.getName());
    }
}
