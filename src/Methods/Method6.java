package Methods;

public class Method6 {

	public static void main(String[] args) 
	{
		 demo();
		 System.out.println(demo());
		 
		
		 System.out.println(addition());
		 
		 int add=additionofTwoNumbers(50, 100);
		 System.out.println(add);

	}
	public static int demo()
	{
		System.out.println("I am from demo method");
		return 30;
	}
	
	public static int addition()
	{
		System.out.println("I am from addition method");
		return 10+30+60; 
	}
	public static int additionofTwoNumbers(int a,int b)
	{
		System.out.println("I am from additionofTwoNumbers method");
		int c=a+b;
		return c; 
	}

}
