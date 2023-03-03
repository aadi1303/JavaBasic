import java.util.*;

class TypeCast
{
	public static void main(String args[])
	{
		// Typecasting has two types First one is Implicit and Second one is Explicit
		
		int a =45;
		double b;

		b = a;
		System.out.println("Implicit Type Casting: when small data type casted into large data type.");
		System.out.println(+b);
		
		double d = 45.5;
		int num1;

		num1 = (int)d;
		System.out.println("Explicit Type Casting: when largedata type casted into small data type.");
		System.out.println(+num1);
		

	}
}










