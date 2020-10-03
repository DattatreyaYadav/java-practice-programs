package interview;

import java.util.Scanner;

public class Stringreversefirst {

	public static void main(String[] args) {
		System.out.println("enter a string to reverse a  string");
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		System.out.println(s1);
		scan.close();
		String s2="";
		for(int i=(s1.length()/2-1);i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		for(int i=(s1.length()/2);i<s1.length();i++) {
			s2+=s1.charAt(i);
		}
		System.out.println("the new string is : "+s2);
	}

	}


