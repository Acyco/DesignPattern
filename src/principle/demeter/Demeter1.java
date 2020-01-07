package principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Acyco
 * @create 2020-01-08 04:46
 */
public class Demeter1 {
    public static void main(String[] args) {
        System.out.println("~~~~使用迪米特法则的改进~~~~");
        //创建一个对象
        SchoolManager schoolManager = new SchoolManager();
        //输出学院的员工id 和 学校总部员工的信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工
class Employee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院的员工
class CollegeEmployee {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}


class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    public void printEmployee() {
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("------------学院员工----------");
        list1.forEach(e -> System.out.println(e.getId()));
    }
}

//学校管理类

//分析SchoolManager 类的直接的朋友有哪些？  Employee CollegeManager

//CollegeEmployee 不是直接的朋友，而是一个陌生类 这样有违背了迪米特法则
class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub) {
        //分析问题
        //1. 将输出学院的员工方法 将封装到CollegeManager
        sub.printEmployee();
        List<Employee> list2 = getAllEmployee();
        System.out.println("------------学校总部员工----------");
        list2.forEach(e -> System.out.println(e.getId()));
    }
}