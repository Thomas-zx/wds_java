/*15.反射-2*/
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflect1 {
    public static void main(String args[]) throws Exception {
        Class<?> c =null;
        Class<?> c2 =null;
        Object p = null;
        Object p2 = null;
        Object s = null;
        Object s2 = null;

        try {
            c = Class.forName("a.b.c.d.PersonR");       //1.获取Class
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        }

        p = c.newInstance();        //2.new实例

        Constructor<?> con = c.getConstructor(String.class);       //2.new有参数实例
        p2 = con.newInstance("zhang.san");

        Method set = c.getMethod("setName", String.class);  //3.获取方法
        set.invoke(p, "li.si");     //4.调用方法（对象，参数）
        set.invoke(p2, "wang.er.mazi");

        Method get = c.getMethod("getName");
        System.out.println(get.invoke(p));
        System.out.println(get.invoke(p2));

        Field name = c.getDeclaredField("name");    //2.获取属性
        name.setAccessible(true);       //3.设置访问权限

        name.set(p, "li.si.2");         //4.设置属性
        name.set(p2, "wang.er.mazi.2");

        System.out.println(name.get(p));
        System.out.println(name.get(p2));

        try {
            c2 = Class.forName("a.b.c.d.StudentR");       //1.获取Class
        } catch(ClassNotFoundException e) {
            System.out.println(e);
        }

        s = c2.newInstance();

        Constructor<?> con2 = c2.getConstructor(String.class);
        s2 = con2.newInstance("S zhang.san");

        Method set2 = c2.getMethod("setName", String.class);
        set2.invoke(s, "S li.si");
        set2.invoke(s2, "S wang.er.mazi");
        Method get2 = c2.getMethod("getName");

        System.out.println(get2.invoke(s));
        System.out.println(get2.invoke(s2));
    }
}
