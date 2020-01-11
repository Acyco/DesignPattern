package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Acyco
 * @create 2020-01-12 00:08
 */
public class College extends OrganizationComponent{
    //List 中存放的是Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
        super(name, des);
    }
    //重写add

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //将来实际业务中，College的add和University的add不一定完全一样
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
