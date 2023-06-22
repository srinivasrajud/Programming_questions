import java.util.Scanner;
public class Program1 {
	static void math(double a,double b,String operation)
	{
		double result = 0;
		if(operation.equals("add"))
		{
			result=a+b;
			
			System.out.println(result+"j");
		}
		else if(operation.equals("sub"))
		{
			result=a-b;
			System.out.println(result);
		}
		else if(operation.equals("mul"))
		{
			result=a*b;
			System.out.println(result);
		}
		else if(operation.equals("div"))
		{
			try
			{
			result=a/b;
			System.out.println(result);
			}
			catch(Exception e) {				
			}
		}
		else
		{
			System.out.println("Invalid Choice!");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numerator:");
		double a = scan.nextDouble();
		System.out.println("Enter Denominator:");
		double b=scan.nextDouble();
		System.out.println("Different Operations are:");
		System.out.println("1.add");
		System.out.println("2.sub");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("Chose any above Operation");
		String operation=scan.next();
		math(a,b,operation);
		}
}