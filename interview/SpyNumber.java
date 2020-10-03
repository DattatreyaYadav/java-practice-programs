package interview;
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("eneter a number.");
		int number=scan.nextInt();
		int sum=0;
		int multi=1;
		scan.close();
		while(number>0)
		{
			int remainder=number%10;
			sum=sum+remainder;
			multi=multi*remainder;
			number=number/10;
		}
		if(sum==multi)
		{
			System.out.println("SPY NUMBER");
		}
		else
		{
			System.out.println("NOT SPY NUMBER");
		}

	}

}
