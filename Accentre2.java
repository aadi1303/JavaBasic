import java.util.*;
//import java.lang.string;

class Accentre2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password :(Minimum size 4!!!");
		String str=sc.next();
		int n=sc.nextInt();
		if(n<4)
		   System.out.println("0");
		if(str.charAt(0) >='0' && str.charAt(0) <= '9')
		   System.out.println("0");
		
		int num=0, temp=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) ==' ' || str.charAt(i) =='/')
				System.out.println("0");
			if(str.charAt(i) >='A' && str.charAt(i) <='Z')
				temp++;
			if(str.charAt(i) >='0' && str.charAt(i) <='9')
				num++;
		}
		if(temp >0 && num >0)
			System.out.println("1");
		else
			System.out.println("0");

	}
}	