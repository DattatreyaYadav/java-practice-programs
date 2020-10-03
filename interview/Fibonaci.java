package interview;
import java.util.Scanner;
public class Fibonaci {
	public static void main(String[] args) {
     /*
        int n = 100, t1 = 0, t2 = 1;
        
        System.out.print("Upto " + n + ": ");
        while (t1 <= n)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
     */
		Scanner scan=new Scanner(System.in);
		System.out.println("enter fibonaci series till ::");
	    int num =scan.nextInt();	
	    int t1=0,t2=1,sum=0;
	    scan.close();
	    do {
	    	System.out.print(t1+" ");
	    	sum=t1+t2;
	    	t1=t2;
	        t2=sum;	
	    }while(t1<=num);
    }
}
