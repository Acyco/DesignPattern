package principle.ocp.improve;

/**
 * @author Acyco
 * @create 2020-01-08 03:37
 */
public class Ocp {
    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangele());
    }
}

//使用方
class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }else if (s.m_type == 3) { //违反ocp 还要进行修改
            drawTriangele(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("绘制矩形");
    }
    public void drawCircle(Shape r) {
        System.out.println("绘制圆形");
    }
    //违反ocp 还要进行修改
    public void drawTriangele(Shape r) {
        System.out.println("绘制三角形");
    }
}

//Shape类， 基类
class Shape {
    int m_type;
}


class Rectangle extends Shape {
    public Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle () {
        super.m_type = 2;
    }
}

//新增画三角形

class Triangele extends Shape {
    Triangele() {
        super.m_type = 3;
    }
}

/*
方式一的优缺点
       1。 优点是比较好理解，简单易操作
       2。 缺点是违反了设计模式的ocp原则，即对扩展开放，对修改关闭
       即当我们给类增加新功能的时候，尽量不改修代码，或者尽量可能 少修改代码

       3。 如果加个三角形功能。。。 看代码


 */