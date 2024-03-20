package InterviewQuestions;

public class LargestOfTwoNumbersIfElse {

	public static void main(String[] args) 
	{
		largest(5, 5);
		
		int a=10,b=20;
		
		if(a<b)
		{
			System.out.println("Largest is a ");
		}
		else
		{
			System.out.println("Largest is b ");
		}

	}
	
	public static void largest (int a,int b)
	{
		if(a>b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(" I am b : "+b);
		}
				
	}

}
