package flyweight;

/**
 * @author Acyco
 * @create 2020-01-13 20:03
 */
public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户要一个以新闻形式发布的网站
        WebSite webSite1 = webSiteFactory.getWebsiteCategory("新闻");

        webSite1.use(new User("tom"));

        //客户要一个以博客形式发布的网站
        WebSite webSite2 = webSiteFactory.getWebsiteCategory("博客");
        webSite2.use(new User("jack"));

        //客户要一个以博客形式发布的网站
        WebSite webSite3 = webSiteFactory.getWebsiteCategory("博客");
        webSite3.use(new User("smith"));

        WebSite webSite4 = webSiteFactory.getWebsiteCategory("博客");
        webSite4.use(new User("king"));

        //获取网站的分类数量
        System.out.println("网站的分类共=" + webSiteFactory.getWebSiteCount());

        Integer x1 = Integer.valueOf(127);
        Integer x2 = Integer.valueOf(127);
        boolean x = x1 == x2;
        System.out.println(x);  //x 是 真/假???
         Integer y1 = Integer.valueOf(128);
        Integer y2 = Integer.valueOf(128);
        boolean y = y1 == y2;
        System.out.println(y);  //y 是 真/假???

    }
}
