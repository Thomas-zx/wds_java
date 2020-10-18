/*10.多态*/

class FatherC {
    private int money;

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void printInfo() {
        System.out.println("This is father");
    }

    public void drink() {
        System.out.println("Father:drink");
    }
}

class SonC extends FatherC {
    public void printInfo() {
        System.out.println("This is son");
    }

    public void playGame() {
        System.out.println("Son:play game");
    }
}

class Daughter extends FatherC {
    public void printInfo() {
        System.out.println("This is daughter");
    }

    public void dance() {
        System.out.println("Daughter:dance");
    }
}

public class Cnv {
    public static void main(String argv[]) {
        FatherC f =new FatherC();
        SonC son = new SonC();
        Daughter dau = new Daughter();

        print(f);
        print(son);
        print(dau);
        printAction(f);
        printAction(son);
        printAction(dau);
    }

    public static void main2(String argv[]) {
        /*向下转换，子类实例赋值给父类对象*/
        FatherC f = new SonC(); //先向上转换
        SonC son = (SonC) f;    //在向下转换
        print(f);

        f = new Daughter(); //先向上转换
        Daughter dau = (Daughter) f;    //在向下转换
        print(f);
    }
    public static void main1(String argv[]) {
        SonC son = new SonC();
        Daughter daughter = new Daughter();
        /*向上转换，父类对象等于子类实例*/
        FatherC f = son;
        /*父类对象调用，如果子类复写了，调用子类，如果没有，调用父类*/
        f.printInfo();
        f = daughter;
        f.printInfo();
    }

    public static void print(FatherC f) {
        f.printInfo();
    }

    public static void printAction(FatherC f) {
        /*必须先判断子类，否定都会匹配父类*/
        if (f instanceof SonC) {
            SonC son = (SonC)f;
            son.playGame();
        }
        else if(f instanceof Daughter) {
            Daughter dau = (Daughter)f;
            dau.dance();
        }
        else if (f instanceof FatherC) {
            f.drink();
        }
    }
}
