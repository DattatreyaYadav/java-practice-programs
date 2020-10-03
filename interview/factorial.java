package interview;
import java.util.Scanner;
public class factorial
{

	public static void main(String[] args) 
	{
		int num,fact=1,i=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number to find factorial :: ");
		num=scan.nextInt();
		while(i<=num) 
		{
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of  "+num+" is "+fact);
         scan.close();
	}

}
 /*
  
  int num =10;
  int fact=1;
  int i =num;
  while(i>=1)
  {
  fact=fact*i;
  i--;
  }
  
  
  
  
  */
