package principle.inversion.improve;

/**
 * @author Acyco
 * @create 2020-01-08 02:09
 */
public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Winxin());
    }
}

//定义接口

interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息：hello world";
    }
}
class Winxin implements IReceiver {
    public String getInfo() {
        return "微信信息：OK";
    }
}
class Person {
    public void receive (IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}

