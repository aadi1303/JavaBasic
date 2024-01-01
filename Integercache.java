import java.util.*;

class Integercache
{
    public static void main(String arg[])
    {
        int a = 10;
        int b = 30;

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
    }
}