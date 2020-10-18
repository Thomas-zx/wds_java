/*02.数据类型*/
public class Var {
    public static void main(String argv[]) {
        int a = 3;
        float f = (float) 3.14;
        float f2 = 3.14f;
        short s = 4;
        //short s2 = (short)40000;
        //System.out.println(s2);
        s = (short)(s + 1);

        int p[] = new int[10];
        int p2[] = {1, 2, 4};
        char str[] = new char[100];
        String str2 = "abc";

        p = null;
        p2 = null;
        str = null;
        str2 = null;

    }
}