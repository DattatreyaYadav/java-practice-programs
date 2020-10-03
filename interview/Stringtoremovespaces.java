package interview;

import java.util.Scanner;

public class Stringtoremovespaces {

	public static void main(String[] args) {
	
		System.out.println("enter a string to remove spaces between string");
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		System.out.println(s1);
		int len=s1.length();
	    String rem="";
	    int si=0;
	    for(int i=0;i<len;i++)
	    {
	    	if(s1.charAt(i)!=' ') 
	    	   {
	    		  si=i;
	    	      break;
	           }
	    }
	    int ai=0;
	    for(int i=len-1;i>=0;i--)
	    {
	    	if(s1.charAt(i)!=' ') 
	    	   {
	    		  ai=i;
	    	      break;
	           }
	    }
	    for(int i=si; i<=ai ; i++) 
	    {
	    	if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
	    	{
	    		rem+=s1.charAt(i);
	    	}
	    	else if (s1.charAt(i)!=' ') {
	    		rem+=s1.charAt(i);	
	    	}
	    	
	    }
	    System.out.println(rem);	}
}
