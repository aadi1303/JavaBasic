import java.util.*;
class NonStaticMemberDemo{
	int num;
	// Constructor
	NonStaticMemberDemo(){
		System.out.println("Inside the  constuctor");
	}
	//Non Static Block
	{
		System.out.println("Inside the non-static block");
	}
 
	public static void main(String args[]){
		System .out.println("Inside the main method");
		new NonStaticMemberDemo();
	}
}