/*14.泛型*/

class PersonG<T> {
    private T age;

    public void setAge(T age) {
        this.age = age;
    }

    public T getAge() {
        return age;
    }
}

interface PersonGI<T> {
    public void setAge(T age);
    public T getAge();
}

class StudentG1<T> implements PersonGI<T> {
    T age;
    public void setAge(T age) {
        this.age = age;
    }

    public T getAge() {
        return age;
    }
}

class StudentG2 implements PersonGI<String> {
    String age;
    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
}
/*指定上限*/
class StudentET<T extends Number> implements PersonGI<T> {
    T age;

    public void setAge(T age) {
        this.age = age;
    }

    public T getAge() {
        return age;
    }
}

class StudentET2 implements PersonGI<String> {
    String age;
    @Override
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getAge() {
        return age;
    }
}


public class Generics {
    public static void main(String argv[]) {
        PersonG<String> p1 = new PersonG<String>();
        p1.setAge("11 year");
        printInfo(p1);

        PersonG<Integer> p2 = new PersonG<Integer>();
        p2.setAge(11);
        printInfo(p2);

        PersonG<?> p3;
        p3 = p1;
        printInfo(p3);

        printInfo2(p1);
        printInfo2(p2);

        StudentG1<Integer> s1 = new StudentG1<Integer>();
        s1.setAge(15);
        printInfoI(s1);

        StudentG2 s2 = new StudentG2();
        s2.setAge("16 year");
        printInfoI(s2);

        //StudentET<String> s3 = new StudentET<String>();   //错误，有上限
        StudentET<Integer> s3 = new StudentET<Integer>();
        s3.setAge(20);
        printInfoI(s3);

        StudentET2 s4 = new StudentET2();
        s4.setAge("11");
        //s4.setAge(21);   //错误，有下限
        printInfoI(s4);
    }

    public static void printInfo(PersonG<?> p) {
        System.out.println(p.getAge());
    }

    public static <T> void printInfo2(PersonG<T> p) {
        System.out.println(p.getAge());
    }

    public static void printInfoI(PersonGI<?> p) {
        System.out.println(p.getAge());
    }

    public static void printInfoS(PersonGI<? super String> p) {
        System.out.println(p.getAge());
    }

}
