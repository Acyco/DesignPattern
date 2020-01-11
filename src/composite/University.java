package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Acyco
 * @create 2020-01-11 23:58
 */
//university 就是Composite 可以管理college
public class University extends OrganizationComponent{
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    //构造器
    public University(String name, String des) {
        super(name, des);

    }
    //重写add

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    //重写remove

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        super.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //pring方法，就是输出University 包含的学院
    @Override
    protected void print() {
        System.out.println("----------"+getName()+"------------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }


    }
}
