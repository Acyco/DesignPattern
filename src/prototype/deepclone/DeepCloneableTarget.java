package prototype.deepclone;

import java.io.Serializable;

/**
 * @author Acyco
 * @create 2020-01-10 02:31
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {

        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }
//因为该类的属性 都是String 因为我们这里使用默认的clome完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}

