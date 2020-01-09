package prototype.deepclone;

/**
 * @author Acyco
 * @create 2020-01-10 02:41
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "XXXX";
        p.deepCloneableTarget = new DeepCloneableTarget("YYYY","YYYY的一个类");
        //方式一 完成深拷贝

        DeepProtoType p2 = (DeepProtoType) p.clone();
        System.out.println("p.name = "+p.name + " p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
        System.out.println("p2.name = "+p2.name + " p2.deepCloneableTarget="+p2.deepCloneableTarget.hashCode());

        //方式2 完成深拷贝

        DeepProtoType p3 = (DeepProtoType) p.deepClone();
        System.out.println("p.name = "+p.name + " p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
        System.out.println("p3.name = "+p3.name + " p3.deepCloneableTarget="+p3.deepCloneableTarget.hashCode());

    }
}
