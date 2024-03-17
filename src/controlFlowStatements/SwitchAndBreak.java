package controlFlowStatements;

public class SwitchAndBreak {

	public static void main(String[] args) 
	{
		char c='m';
		
		switch(c)
		{
			case 'a':
			{
				System.out.println("I am from case a");
			}
			
			case 'm':
			{
				System.out.println("I am from case m");
				break;
			}
			
			case 'n':
			{
				System.out.println("I am from case n");
			}
		
		}
	}
}
