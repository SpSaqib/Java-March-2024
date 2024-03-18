package scannerCalss;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) 
	{
	
		Scanner s=new Scanner(System.in);
		
		int a = s.nextInt();
		System.out.println(a);
		
		long l = s.nextLong();
		System.out.println(l);
		
		float f = s.nextFloat();
		System.out.println(f);
		
		String str = s.next();
		System.out.println(str);
		
		char c = s.next().charAt(0);
		System.out.println(c);
		
		boolean b = s.nextBoolean();
		System.out.println(b);
		
		
		
		//	int a = s.nextInt();
		// long l = s.nextLong();
		// float f = s.nextFloat();
		// String str = s.next();
		// char c = s.next().charAt(0);
		// boolean b = s.nextBoolean();
	

	}

}
