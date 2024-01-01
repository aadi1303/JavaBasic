import java.util.*;
import java.io.*;

class aju2
{
    public static void main(String arg[])
    {
        int a;
        Scanner sc =new Scanner(System.in);
        
        a = sc.nextInt();

        try
        {
            System.out.println(a/0); 
        }
        catch(ArithmeticException e)
        {
             System.out.println("Not divdie by zero(0)");
        }
        
     }
}