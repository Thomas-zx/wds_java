/*11.异常*/
/*RuntimeException运行时错误 可以不处理，如果不处理，程序退出*/
/*Error Java虚拟机本身的错误，无法处理*/
/* try catch finally throw*/

public class Exceptiont {
    public static void main(String argv[]) {
        int m = 0;
        int n = 0;

        try {
            m = Integer.parseInt("6");
            //n = Integer.parseInt("0");
            n = Integer.parseInt("a");
        } catch (RuntimeException e) {
            System.out.println(e);
            n = Integer.parseInt("0");
        }

        int r = div1(m, n);
        System.out.println(r);

        try {
            r = div2(m, n);
        } catch (ArithmeticException e) {
            r = 0;
            System.out.println("main div2 " + e);
        } finally {
            /*无论怎样都会执行*/
            System.out.println("man div2 finally");
        }
        System.out.println(r);

        try {
            r = div3(m, n);
        } catch (ArithmeticException e) {
            r = 0;
            System.out.println("main div3 " + e);
        } finally {
            /*无论怎样都会执行*/
            System.out.println("main div3 finally");
        }
        System.out.println(r);

        try {
            r = div4(m, n);
        } catch (ArithmeticException e) {
            r = 0;
            System.out.println("main div3 " + e);
        }  catch (Exception e) {
            System.out.println(e);
            n = Integer.parseInt("0");
        }
        System.out.println(r);
    }

    /*自己处理*/
    public static int div1(int m, int n) {
        int r = 0;
        try {
            r = m / n;
        } catch (ArithmeticException e) {
            System.out.println("div1 " + e);
        } finally {
            /*无论怎样都会执行*/
            System.out.println("div1:finally");
        }
        return r;
    }

    /*自己处理一部分，抛给调用者处理一部分*/
    public static int div2(int m, int n) throws ArithmeticException {
        int r = m / n;
        return r;
    }

    public static int div3(int m, int n) {
        int r = 0;
        try {
            r = m / n;
        } catch (ArithmeticException e) {
            System.out.println("div3 " + e);
            /*再次抛出异常*/
            throw e;
        } finally {
            /*无论怎样都会执行*/
            System.out.println("div3: finally");
        }
        return r;
    }

    public static int div4(int m, int n) throws Exception {
        int r = 0;
        try {
            r = m / n;
        } catch (ArithmeticException e) {
            System.out.println("div4 " + e);
            /*抛出自定义异常*/
            throw new Exception("My Error");
        } finally {
            /*无论怎样都会执行*/
            System.out.println("div3: finally");
        }
        return r;
    }
}
