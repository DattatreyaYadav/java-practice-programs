package interview;
import java.util.Scanner;
public class Demo1 {
	public static void main(String []args) {
		System.out.println("enter a string :");
	    Scanner scan=new Scanner(System.in);
	    String s1= scan.nextLine();
	    String remm="";
	    char ar[]=s1.toCharArray();
	    int i,j;
	    char temp;
	    for(i=0;i<=ar.length-2;i++)
	    {
	    	for(j=i+1;j<=ar.length-1;j++)
	    	{ 
	    		if(ar[i]>=ar[j]) {
	    		temp=ar[i];
	    		ar[i]=ar[j];
	    		ar[j]=temp;	
	    		}
	    	}
	    } 
	    for(int k=0;k<=ar.length-1;k++) {
	       System.out.println(ar[k]); 
	     }
	    scan.close();
	    for(int k=0;k<=ar.length-1;k++) {
	    	if(ar[k]!=ar[k+1]) {
	        System.out.println(ar[k]); 
	    	}
	    }
	}	
}
