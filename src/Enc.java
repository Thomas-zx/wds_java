/*06.封装*/
class PersonE {
    /*私有权限*/
    private int age;

    public void setAge(int age) {
        if ((age <= 0) && (age >=150))
            this.age = age;
        else
            this.age = age;
    }

    public int getAge() {
        return age;
    }
}


public class Enc {
    public static void main(String argv[]) {
        PersonE per = new PersonE();
        per.setAge(100);
        System.out.println(per.getAge());
    }
}
