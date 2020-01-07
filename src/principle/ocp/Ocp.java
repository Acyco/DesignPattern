package principle.ocp;

/**
 * @author Acyco
 * @create 2020-01-08 03:53
 */
public class Ocp {
    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangele());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

//使用方
class GraphicEditor {
    //接收Shape对象，调用draw()方法
    public void drawShape(Shape s) {
      s.draw();
    }

}
//Shape类， 基类
abstract class Shape {
    int m_type;

    public abstract void draw();
}


class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle () {
        super.m_type = 2;
    }
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//新增画三角形

class Triangele extends Shape {
    Triangele() {
        super.m_type = 3;
    }
    public void draw() {
        System.out.println("绘制三角形");
    }
}

//新增一个图形

/**
 * 我们新增加一个其他的，， 完全不用对之前做进行修改
 */
class OtherGraphic extends Shape {
    public OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他形");
    }
}

/*
方式一的优缺点
       1。 优点是比较好理解，简单易操作
       2。 缺点是违反了设计模式的ocp原则，即对扩展开放，对修改关闭
       即当我们给类增加新功能的时候，尽量不改修代码，或者尽量可能 少修改代码

       3。 如果加个三角形功能。。。 看代码


 */