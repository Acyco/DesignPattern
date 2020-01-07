package principle.inversion;

/**
 * @author Acyco
 * @create 2020-01-08 01:59
 */
public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}


/**
 * 完成Person接收消息的功能
 * 方式1分析
 * 1。简单，比较容易想到
 * 2。 如果 我们获取的对象是 微信 短信等，则新增类 同时Person类增加相应的接收方法
 * 3。 解决思路：引入一个抽象 的接口IReceive 表示接收者，这样Person类与接口IReceive发生依赖
 * 因为Email，Weixin 等等属于接收范围， 他们各自实现IReceive接口就OK，这样我们就符合依赖倒转原则
 */

class Email {
    public String getInfo() {
        return "电子邮件信息：hello world";
    }
}

class Person {
    public void receive (Email email) {
        System.out.println(email.getInfo());
    }
}

