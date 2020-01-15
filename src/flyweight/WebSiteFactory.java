package flyweight;

import java.util.HashMap;

/**
 * @author Acyco
 * @create 2020-01-13 19:58
 */

//网站工厂类，根据需要返回压一个网站
public class WebSiteFactory {
    //集合，充当池的作用。
    private HashMap<String, ConcrateWebSite> pool = new HashMap<>();


    //根据网站的类型，返回一个网站，如果 没有就创建一个网站，并放入到池中。
    public WebSite getWebsiteCategory(String type) {
        if (!pool.containsKey(type)) {
            //就创建一个网站，并放入到池中。
            pool.put(type, new ConcrateWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    //获取网站分类的总数 （池中有多少个网站对象）
    public int getWebSiteCount() {
        return pool.size();
    }
}
