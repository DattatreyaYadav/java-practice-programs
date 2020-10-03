package interview;
import java.util.Scanner;

public class Training {

	public static void main(String[] args) {
		

       System.out.println("enter a string to reverse a  string");
       Scanner scan=new Scanner(System.in);
	   String s1=scan.nextLine();
	   System.out.println(s1);
	   scan.close();
	   int j=0;
	   for(int i=0;i<s1.length()-1;i++)
	   {
		   if(s1.charAt(i)!='g')
			   j++;
	   }
	   System.out.println("the position of g is :"+j);

	}

}
