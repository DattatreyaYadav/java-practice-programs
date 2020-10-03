package interview;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the range to print prime numbers .");
		System.out.println("enter the starting number .");
		int start=scan.nextInt();
		System.out.println("enter the ending number .");
		int last=scan.nextInt();
		scan.close();
		while(start<last)
		{
			boolean flag=false;
			for(int i=2;i<start/2;i++)
			{
				if(start%i==0)
				{
					flag=true;
					break;
				}	
			}
			if(!flag && start!=0 && start!=1)
			{
				System.out.println(start+" ");
			}
			start++;
		}
	}

}
