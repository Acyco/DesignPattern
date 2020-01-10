package bridge;

/**
 * @author Acyco
 * @create 2020-01-11 01:57
 */
public class Client {
    public static void main(String[] args) {
        //获取折叠手机（样式+品牌）
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.close();
        phone1.call();

        System.out.println("==========================");
         Phone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.close();
        phone2.call();

        System.out.println("==========================");
        Phone phone3 = new UpRightPhone(new XiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();

        System.out.println("==========================");
        Phone phone4 = new UpRightPhone(new Vivo());
        phone4.open();
        phone4.call();
        phone4.close();

    }
}
