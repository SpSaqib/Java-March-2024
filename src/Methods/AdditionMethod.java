package Methods;

public class AdditionMethod {

	public static void main(String[] args) {
		
		
		additionFromVoid();
		int c = 0;
		
		System.out.println(c);
		
		System.out.println(additionFromInt());
		System.out.println(additionFromVoid());
		
	}
	
	public static void additionFromVoid()
	{
		int a = 7, b=10;
		
		int add=a+b;
		System.out.println(add);
		
	}
	
	public static int additionFromInt()
	{
		int a = 20, b=30;
		
		int add=a+b;
		
		return add;
		
	}
	
	// int c = 0;
	// int additionFromVoid();

}
