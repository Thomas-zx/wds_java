/*05.面向对象*/
class Person {
    String name;
    int age;
    /*类属性*/
    static int count;

    /*静态代码块*/
    static {
        System.out.println("static construct block");
    }

    /*构造块*/
    {
        System.out.println("construct block");
        count++;
    }

    /*构造函数*/
    Person() {
        name = "";
        age = 0;
        //count++;
    }

    Person(String name) {
        this.name = name;
        age = 0;
        //count++;
        System.out.println("construct method");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        //count++;
        System.out.println("construct method");
    }

    /*普通方法*/
    public void print() {
        System.out.println("name:" + name + " age:"+ age);
    }

    /*类方法*/
    public static void printTest() {
        System.out.println("print test count:" + count);
    }
}

public class Oop {
    public static void main(String argv[]) {
        Person p1 = new Person("zhangsan");
        Person p2 = new Person("lisi", 25);

        p1.print();
        p2.print();

        Person.printTest();
    }
}

