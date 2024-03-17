package controlFlowStatements;

public class ElseIfLadder {

	public static void main(String[] args) 
	{
		int num=17;
		
		if(num%2==0)
		{
			System.out.println("Number is divisible by 2");
		}
		
		else if(num%5==0)
		{
			System.out.println("Number is divisible by 5");
		}
		
		else
		{
			System.out.println("Number is not divisible by 2 and 5");
		}

	}

}
