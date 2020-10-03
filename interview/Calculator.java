package interview;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int a,b,choice,result;
        System.out.println("enter first number :: ");
        a=sc.nextInt();
        System.out.println("enter second number :: ");
        b=sc.nextInt();
        sc.close();
        System.out.println("option......");
        System.out.println("1).addition");
        System.out.println("2).substration");
        System.out.println("3).multiplication");
        System.out.println("4).division");
        System.out.println("5).mod");
        System.out.println("select your option.........");
        choice=sc.nextInt();
        switch(choice) {
        case 1:
        	result=(a+b);
        	System.out.println("addition= "+result);
        	break;
        case 2:
        	result=(a-b);
        	System.out.println("substration = "+result);
        	break;
        case 3:
        	result=(a*b);
        	System.out.println("multiplication = "+result);
        	break;
        case 4:
        	result=(a%b);
        	System.out.println("division = "+result);
        	break;
        case 5:
        	result=(a/b);
        	System.out.println("mod= "+result);
        	break;
        default:
        	System.out.println("invalid input......");   
        
        }
}
}