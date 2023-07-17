package staticImp;

public class StaticImpClass {
    static int x;

    static {
        x=20;
        System.out.println("Addition of 10 to the value of x is: "+( x+10));
    }
}
