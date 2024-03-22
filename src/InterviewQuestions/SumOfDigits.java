package InterviewQuestions;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args)
	{
		
		
		int number=123;
		
		int sum=0;
		
		
		while(number>0)
		{
			int reminder=number%10; //3,2,1
			
			sum=sum+reminder; // 3,5,6
			
			number=number/10; // 12,1,0
			
		}
		
		System.out.println(sum);
		
		

	}

}
