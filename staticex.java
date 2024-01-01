import java.util.*;
class Demo
{
	int a;
	void one()
	{
		a=15;
	}
	static void two()
	{
		a=11;
	}	

	public static void main(String arg[])
	{
		Demo x = new Demo();
		Demo y =new Demo();
		Demo z = new Demo();
			y.one();
		Demo.two();
	}
}