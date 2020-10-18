/*08.抽象类*/

abstract class FatherT {
    private int money;

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    private void printInfo() {
        System.out.println("This is Father");
    }

    public void printInfoF() {
        System.out.println("This is Father");
    }
    /*指定继承者必须实现的方法*/
    public abstract void study();   //只能是抽象方法
}

class SonT extends FatherT {
    public void printInfo() {
        System.out.println("This is Son");
    }

    public void printInfoF() {
        System.out.println("This is Son");
    }

    public void study() {
        System.out.println("study");
    }
}

public class Abstractt {
    public static void main(String argv[]) {
        /*抽象类不能实例化对象*/
        //FatherT fat = new FatherT();
        SonT son = new SonT();
        son.study();
    }
}
