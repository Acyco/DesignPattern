package principle.inversion;

/**  接口方式 构造方式 setter方法
 * @author Acyco
 * @create 2020-01-08 02:13
 */
public class DependencyPass {
    public static void main(String[] args) {
        TCL tcl = new TCL();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(tcl);//接口传递

        TCL2 tcl2 = new TCL2();
        OpenAndClose2 openAndClose2 = new OpenAndClose2(tcl2);//构造方法
        openAndClose2.open();


        TCL3 tcl3 = new TCL3();
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(tcl3);//setter方法
        openAndClose3.open();


    }
}

/**
 * 方式1 通过接口传递实现依赖
 */
interface IOpenAndClose {
    public void open(ITV tv); //抽象方法，接收接口
}

interface ITV { //ITV接口
    public void play();
}

class OpenAndClose implements IOpenAndClose {


    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

class TCL implements ITV {

    @Override
    public void play() {
        System.out.println("TCL电视机打开了");
    }
}
/**
 * 方式二，通过构造方法依赖传递
 */
interface IOpenAndClose2 {
    public void open(); //抽象方法，
}

interface ITV2 { //ITV接口
    public void play();
}

class OpenAndClose2 implements IOpenAndClose2 {
    public ITV2 tv; //成员

    public OpenAndClose2(ITV2 tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }
}


class TCL2 implements ITV2 {

    @Override
    public void play() {
        System.out.println("TCL2电视机打开了");
    }
}
/**
 * 方式三 通过setter方法传递
 */
interface IOpenAndClose3 {
    public void open(); //抽象方法，

    public void setTv(ITV3 tv);
}

interface ITV3 { //ITV接口
    public void play();
}

class OpenAndClose3 implements IOpenAndClose3 {
    public ITV3 tv; //成员

    @Override
    public void setTv(ITV3 tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        tv.play();
    }

}

class TCL3 implements ITV3 {

    @Override
    public void play() {
        System.out.println("TCL3电视机打开了");
    }
}

