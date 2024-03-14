package Basics;

public class ConditionalOperator3 {

	public static void main(String[] args) 
	{
		
		int a,b,c;
		a=100;
		b=50;
		c=150;
		
		int largest1=a>b?a:b;
		
		int largest2=largest1>c? largest1:c;
		
		System.out.println(largest2);
		

	}

}
