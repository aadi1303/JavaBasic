import java.util.*;

class Accenture1
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=sc.next();
		
			if(str==null)
			     return -1;
			int res = str.charAt (0) -'0';
	
		for(int i=1;i<str.length();)
		{
			char cont=str.charAt(i);
			i++;
			if(cont =='A')
			
				res =res & (str.charAt(i) -'0');
			
			else if(cont=='B')
			
				res=res | (str.charAt(i)-'0');
			
			else
			
				res=res ^ (str.charAt(i)-'0');
				i++;
			
			return res;
		}
	}
}
			