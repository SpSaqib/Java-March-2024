package Basics;

public class ConditionalOperator4 {

	public static void main(String[] args) 
	{
		int a,b;
		a=100;
		b=50;
		
		int smallest=a<b?a:b;
		
		System.out.println(smallest);
		
		if(a>b)
		{
			System.out.println("Largest is : "+a);
		}
		else 
		{
			System.out.println("Largest is : "+b);
		}

	}

}
