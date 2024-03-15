package Methods;

public class Method3 {

	public static void main(String[] args) 
	{
		addition();
		
		addTwoNumbers(5, 10);
		
		addTwoNumbers(10, 30);
		
		squareNumber(4);
		
	}
	
	public static void addition() 
	{
		int a,b;
		a=10;
		b=20;
		int result=a+b;
		System.out.println("Addition of a and b is : "+result);
		
	}
	
	//Parameterised method or Arguemented method
	public static void addTwoNumbers(int a,int b) 
	{
		int result=a+b;
		
		System.out.println("Addition of a and b is : "+result);
	}
	
	public static void squareNumber(int a)
	{
		int square=a*a;
		System.out.println(square);
	}
	

}
