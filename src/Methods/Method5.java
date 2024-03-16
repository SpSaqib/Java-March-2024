package Methods;

public class Method5 {

	public static void main(String[] args) 
	{
		printMyName();
		printMySirName("Pendhara");
		String userCountryName=myCountryName();
		String userStateName=myStateName();
		System.out.println(userCountryName);
		System.out.println(userStateName);
	}
	
	public static void printMyName()
	{
		System.out.println("Saqib");
	}
	public static void printMySirName(String sirName)
	{
		System.out.println(sirName);
	}
	
	public static String myCountryName()
	{
		System.out.println("I am from country name");
		return "India";
	}
	
	public static String myStateName()
	{
		System.out.println("I am from State name");
		String state="Karnataka";
		return state;
	}
	

}
