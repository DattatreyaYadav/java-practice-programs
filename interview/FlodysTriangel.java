package interview;
import java.util.Scanner;
public class FlodysTriangel 
{
	public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);
	  System.out.println("FLOYD'S TRIANGLE");
	  System.out.println("enter number of rows.");
	  int rows=scan.nextInt();
	  int number=1;
	  for(int i=0;i<rows;i++)
	  {
		for(int j=0;j<=i;j++)
		{
			System.out.print(number+" ");
			number++;
		}
		System.out.println();
	  }
	  scan.close();
	}
}
