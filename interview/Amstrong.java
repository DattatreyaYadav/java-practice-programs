package interview;
import java.util.*;
public class Amstrong
{
	public static void main(String[] args)
	{
		
      Scanner scan=new Scanner(System.in);
      System.out.println("enter a number to find amstrong ::");
      int number=scan.nextInt();
      int result=0;
      int original_number=number;
      while(number!=0) 
      {
    	int remainder=number%10;
    	result=(int) (result+Math.pow(remainder,3));
        number/=10;
      }
    if(result==original_number)
      {
        System.out.println("entered number is a amstrong number");
      }
    else 
      {
    	System.out.println("entered number is not an amstrong number");
      } 
    scan.close();
	}

}
