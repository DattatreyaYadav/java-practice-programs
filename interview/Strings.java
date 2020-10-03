package interview;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter a string");
			String str1;
			str1 =sc.nextLine();
		    String str2=" ";
		    int len=str1.length();
		    for(int i=len-1;i>=0;i--) {
		    	str2+=str1.charAt(i);
		    }
		    System.out.println("reverse string of "+str1+" is "+str2);
			
		}
	}


