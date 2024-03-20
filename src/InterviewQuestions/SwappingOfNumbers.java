package InterviewQuestions;

public class SwappingOfNumbers {

	public static void main(String[] args) 
	{
		
		int a=5,b=10;
		
		// First Method
//		System.out.println("Before Swapping :   "+a+"     "+b);
//		a=a+b;//15
//		
//		b=a-b;//5
//		a=a-b;//10
//		System.out.println("After Swapping :   "+a+"     "+b);
//		
		
		//Second Method
//		System.out.println("Before Swapping :   "+a+"     "+b);
//		
//		a=a*b;//50
//		b=a/b;//5
//		a=a/b;//10
//		System.out.println("After Swapping :   "+a+"     "+b);
		
		//Third Method
		System.out.println("Before Swapping :   "+a+"     "+b);
		
		b=a+b-(a=b);//15-10=5
		
		System.out.println("After Swapping :   "+a+"     "+b);
		
		
		

	}

}
