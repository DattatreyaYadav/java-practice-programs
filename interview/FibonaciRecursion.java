package interview;

import java.util.Scanner;

public class FibonaciRecursion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of sequnces ::");
	    int num =scan.nextInt();
	    System.out.println("fibonaci using non recursive funtion .");
	    fibo(num);
	    System.out.println();
	    System.out.println("fibonaci using recursion .");
	    for(int i=0;i<num;i++) 
	    {
	    	System.out.print(fibonaci(i));
	    	System.out.print(" ");	
	    }
         scan.close();
	}
	public static void fibo(int num)
	{
		int t1=0,t2=1,sum=0,i=0;
	    do {
	    	System.out.print(t1+" ");
	    	sum=t1+t2;
	    	t1=t2;
	        t2=sum;
	        i++;
	    }while(i<num);
	}
	public static int fibonaci(int i)
	{
		if(i==0) return 0;
		if(i<=2)  return 1;
		return fibonaci(i-1)+fibonaci(i-2);
	}

}
