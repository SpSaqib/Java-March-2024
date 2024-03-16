package Methods;

public class Method7 {

	public static void main(String[] args) 
	{
		int b=20-add(5, 2);
		
		System.out.println(b);
		System.out.println(areaOfSquare(5));
		System.out.println(areaOfSquare(6));
		
		System.out.println(areaOfTrianle(5,8));
		
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int areaOfSquare(int a)
	{
		return a*a;
	}
	public static float areaOfTrianle(float base, float height)
	{
		float area= (float) (0.5*base*height);
		
		return area;
	}

}
