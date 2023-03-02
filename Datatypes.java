import java.util.*;

class DataTypes
{
	public static void main(String args[])
	{
		
		//byte has 1 Byte=8 bit . Its space is 4 times smaller than an Integer.
		byte a=10;
		byte b=-20;
		
		System.out.println("Byte values: "+a);
		System.out.println("Byte values: "+b);

		// short  has 2 Byte=16 bit .Its space is 2 times smaller than an Integer.
		short s = 10000;
		short r = -5000;
		
		System.out.println("short value: "+s);
		System.out.println("short value: "+r);		

		// int has 4Byte=32 bit. The int data type is generally used as a default data type for integral values unless if there is no problem about memory.
		int i =1290;
		//data =129;

		System.out.println("Int value: "+i);

		// long has 8 Byte=64 bit.It uses suffix afternumber because to allocate 8 byte memory
		long l=100000L;
		long m=4555L;

		System.out.println("long value: "+l);
		System.out.println("long value: "+m);

		// float has 4 Byte=32 bit.
		float data=45.5f;

		System.out.println("float value: "+data);
		

		// double has 8 Byte =64 bit.
		double info=45.5;

		System.out.println("double value: "+info);

		// logical or boolean : true or false
		boolean d= false;
	
		System.out.println("boolean value: "+d);		

		// character use 2 Byte in java becasue java use Unicode system.
		char c = 'A';

		System.out.println("char value: "+c);

	}
}










