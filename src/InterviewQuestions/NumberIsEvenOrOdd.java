package InterviewQuestions;

public class NumberIsEvenOrOdd {

	public static void main(String[] args) 
	{
		
		evenOdd(5);
		evenOdd(8);
		

	}
	
	public static void evenOdd(int num)
	{
		String evenOdd=num%2==0?"even":"odd";
		
		System.out.println(evenOdd);
	}
	

}
