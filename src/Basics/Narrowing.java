package Basics;

public class Narrowing {

	public static void main(String[] args) {
		
		float f=20;
		System.out.println(f);
		
		// Explicitly
		int a=(int)f;
		
		System.out.println(a);
		System.out.println(f);
		
		
		//Widening
		double d=a;
		System.out.println(d);
		
		

	}

}
