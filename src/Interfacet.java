/*09.接口*/
/*一个子类只能继承一个父类*/
/*可以实现多个接口*/

interface A {
    public static final int i = 10;
    public abstract int getNum();   /*只能是抽象方法*/
}

interface B {
    public static String name = "IterfaceB";
    public abstract String getName();
}

class Inter extends FatherT implements A,B {
    @Override
    public int getNum() {
        return i;
    }

    @Override
    public String getName() {
        return name;
    }

    public void study() {
        System.out.println("study");
    }
}

public class Interfacet {
    public static void main(String argv[]) {
        Inter inter = new Inter();
        System.out.println("name:" + inter.getName());
        System.out.println("num:" + inter.getNum());
        inter.study();
    }
}
