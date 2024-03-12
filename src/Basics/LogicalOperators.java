package Basics;

public class LogicalOperators {

	public static void main(String[] args) {
		int a=10,b=20,c=5,d=10;
		
		int f=c;
		
	//	boolean c=(f!=c);
		//Logical &&
		System.out.println(a<b&&b>d);
		System.out.println(f==c&&c>a&&d>c);
		System.out.println(a<=d&&b>=c);
		
		//Logical ||
		
		System.out.println(a<b||b>d);
		System.out.println(f==c||c>a||d>c);
		System.out.println(a<=d||b>=c);
		

	}

}
