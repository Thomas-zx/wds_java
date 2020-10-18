/*07.继承*/
class PersonT {
    /*私有权限*/
    private int age;

    public PersonT() {
        age = 0;
        System.out.println("PersonT construct method");
    }

    public PersonT(int age) {
        this.age = age;
        System.out.println("PersonT arg construct method");
    }

    public void setAge(int age) {
        if ((age <= 0) && (age >=150))
            this.age = age;
        else
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("age = " + age);
    }
}

class Student extends PersonT {
    private String school;

    public Student(String school) {
        /*调用父类的构造函数*/
        super(5);
        this.school = school;
        System.out.println("Student construct method");
    }
    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    /*override*/
    public void printInfo() {
        System.out.println("school = " + school + " age =" + getAge());
    }
}
/*
public class Ext {
    public static void main(String argv[]) {
        Student s = new Student("测试1");
        s.printInfo();
        System.out.println(s.getAge() + " " + s.getSchool());
        s.setAge(10);
        s.setSchool("测试2");
        s.printInfo();
        System.out.println(s.getAge() + " " + s.getSchool());
    }
}
*/
/*
 * 1.儿子无法直接操作父亲的私房钱（私有属性）
 * 2.儿子无法使用父亲的绝招（私有方法）
 * 3.儿子不能私吞祖传的东西（）
 * */

class Father {
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
}

class Son extends Father {
    public void printInfo() {
        System.out.println("This is Son");
    }

    public void printInfoF() {
        System.out.println("This is Son");
    }
    /*(3)不能变成私有的*/
    /*
    private void printInfoF() {
        System.out.println("This is Son");
    }
    */
}

public class Ext {
    public static void main(String argv[]) {
        Son son = new Son();
        /*(1)*/
        //son.money = 100;
        /*可以使用提供的接口*/
        son.setMoney(100);
        System.out.println(son.getMoney());
        /*2*/
        //son.printInfo();
        /*可以发扬光大*/
        son.printInfoF();
    }
}

