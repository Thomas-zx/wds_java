/*12.内部类*/
/*可以访问外部类的私有属性*/
/*
class Outer {
    private int a = 10;

    class InnerClass {
        public void printInfo() {
            System.out.println("a = " + a);
        }
    }
}

public class Inner {
    public static void main(String args[]) {
        Outer out = new Outer();
        Outer.InnerClass in = out.new InnerClass();
        in.printInfo();
    }
}
*/
/*静态内部类直接访问外部类的static属性*/
class Outer {
    private static int a = 10;

    static class InnerClass {
        public void printInfo() {
            System.out.println("a = " + a);
        }
    }
}

public class Inner {
    public static void main(String args[]) {
        Outer.InnerClass in = new Outer.InnerClass();
        in.printInfo();
    }
}
