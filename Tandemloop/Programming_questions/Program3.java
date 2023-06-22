import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		if(a%2==0)
		{
			a=a-1;
		}
		int m=1;
		for(int i=0;i<a;i++)
		{
			System.out.print(m + " ");
			m=m+2;
		}
	}
}
