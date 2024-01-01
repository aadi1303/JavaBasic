import java.util.*;

class Maxno
{
	public  static void main(String arg[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a and b");
		
		a = sc.nextInt();
		b = sc.nextInt();

		if(a>b)
		{
			System.out.println(a+" IS MAX");
		}
		else
		{
			System.out.println(b+" IS MAX");
		}
	}
}