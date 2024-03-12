package Basics;

public class Widening1 {

	public static void main(String[] args) {
		
		int a=10;
		
		long b=a;
		// implicitly
		double c=b; //decimal
		
		char c1=(char) 90;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(c1);

	}

}
