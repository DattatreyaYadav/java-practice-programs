package interview;
import java.util.Scanner;
public class Primenumber
{
	public static void main(String[] args) 
	{
	  boolean flag=false;
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter the number to check wheather it is prime or not prime number");
	  int num=scan.nextInt();
	  scan.close();
	  int i=2;
	  while(i<=num/2) 
	  {
		if(num%i==0)
		{
			flag =true;
			break;
		}
		i++;
	 }
	 if(!flag) 
		 System.out.println(num + " is a prime number.");
	  else
	      System.out.println(num + " is not a prime number.");
	}
}
/*
	for(int i=2;i<=num/2;i++ )
	{
	 if(num%i==0)
	  {
	    flag=true;
	    break}
	  }
    }
	 
 */

