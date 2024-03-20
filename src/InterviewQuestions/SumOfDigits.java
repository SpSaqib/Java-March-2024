package InterviewQuestions;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args)
	{
		
		
		int number=8976;
		
		int sum=0;
		
		while(number>0)
		{
			int reminder=number%10; // 6,7,9,8
			
			sum=sum+reminder; // 6,13,22,30
			
			number=number/10; //897, 89,8,0
		}
		
		System.out.println(sum);
		

	}

}
