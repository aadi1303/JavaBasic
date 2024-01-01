import java.util.*;
class Arith
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void mult(float a,float b,float c)
	{
		float d=a*b*c;
		System.out.println(d);
	}
}

class Circle
{
	void area(float r)
	{
		float d=3.14f*r*r;
		System.out.println(d);
	}
}

class Demo
{
	public static void main(String arg[])
	{
		Arith x = new Arith();
		x.add(7,9);
		x.mult(10.2f,2.2f,0.2f);
	
		Circle y = new Circle();
		y.area(2.88f);
	}
}	