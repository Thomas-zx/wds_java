/*11.package*/
/*解决类的同名问题*/
package Packaget;

import Packaget.ls.Math.*;
import Packaget.zs.Math.*;

public class Pack {
    public static void main(String argv[]) {
        System.out.println("Pack Hello world!");
        System.out.println(Packaget.zs.Math.Math.add(1,2));
        System.out.println(Packaget.zs.Math.Math.sub(2,1));
        System.out.println(Packaget.ls.Math.Math.add(1,2));
        Packaget.zs.Math.Print.printInfo();
    }
}
