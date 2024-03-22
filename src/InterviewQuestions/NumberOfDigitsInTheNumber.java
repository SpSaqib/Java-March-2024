package InterviewQuestions;

public class NumberOfDigitsInTheNumber {

	public static void main(String[] args) 
	{
		int number=3542;
		
		int count=0;
		
		while(number>0)
		{
			number=number/10; //354,35,3,0
			count++;
		}
		
		System.out.println(count);
	}

}
