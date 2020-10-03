package interview;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number :");
		 int num=sc.nextInt();
		 int temp=num,rev=0,rem;
		 while(num>0) {
			 rem=num % 10;
			 num=num / 10;
			 rev=rev*10+rem;
			  }
		 System.out.println("reverse of" +temp+  " is "+rev);
		 if(temp==rev) {
			 System.out.println();
			System.out.println("number is palindrome :)"); 
		 }else {
			 System.out.println();
			System.out.println("number is not palindrome:)"); 
		 }
		 sc.close();
	}
}
