package interview;
import java.util.Scanner;
public class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number. ");
		int number=scan.nextInt();
		int sum=0;
		while(number>0) 
		{
			int remainder=number%10;
			sum=sum+remainder;
			number=number/10;		
		}
		System.out.println(sum);
		scan.close();

	}

}
 
/*
 " RECURSIVE METHOD "
 public static int  sumdigits(int n)
 {
  int sum=0;
  if(n==0)
  {
  retrun sum;
  }
  else
  {
  sum=sum+n%10;
  sumDigits(n/10)
  }
  return sum;
 } 
*/
