package Methods;

public class Method4 {

	public static void main(String[] args) 
	{
//		int b=5;
//		System.out.println(b);
//		
//		int c=multiplication();
//		System.out.println(c);
//		
//		System.out.println(multiplication());
		System.out.println(add(2,3));
		
		System.out.println(minus(5, 3));
	}
	
	public static int multiplication()
	{
		System.out.println("I am from multiplication method");
		return 10;
	}
	
	// int b=5;
	// int methodName=value returning;
	// int multiplication()=10;
	
	//Formal arguements
	
	public static int add(int a,int b)
	{
		System.out.println("I am from add method");
		return a+b;
		
	}
	// int c=d;
	// int add()=a+b
	
	public static int minus(int a,int b)
	{
		System.out.println("I am from minus method");
		return a-b;
		
	}
	

}
