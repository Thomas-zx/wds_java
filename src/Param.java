/*04.方法参数*/
public class Param {
    public static void main(String argv[]) {
        int x = 1;
        fun(x);
        System.out.println(x);
        int p[] = new int[1];
        p[0] = 123;
        fun(p);
        System.out.println(p[0]);
    }

    public static void fun(int x) {
        x = 100;
    }

    public static void fun(int[] x) {
        x[0] = 200;
    }
}
