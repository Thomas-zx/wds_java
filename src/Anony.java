/*13.匿名内部类*/

interface AA {
    public void printInfo();
}

class BB implements AA {
    public void printInfo() {
        System.out.println("class BB interface AA");
    }
}

public class Anony {
    public static void main(String argv[]) {
        /*
        BB b = new BB();
        testFunc(b);
         */
        testFunc(new BB());
        testFunc(new AA() {
            public void printInfo() {
                System.out.println("Annoy AA");
            }
        });
    }

    public static void testFunc(AA a) {
        a.printInfo();
    }
}
