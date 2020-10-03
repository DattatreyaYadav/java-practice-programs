package interview;
import java.util.*;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double num;
        Scanner sc= new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        num = sc.nextDouble();
         
        Double square = Math.pow(num, 2);
        System.out.println("Square of "+ num + " is: "+ square);
	}

}
