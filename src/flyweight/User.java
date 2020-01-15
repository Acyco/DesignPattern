package flyweight;

/**
 * @author Acyco
 * @create 2020-01-13 20:13
 */
//用户
public class User {

    //共享的内部状态

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
