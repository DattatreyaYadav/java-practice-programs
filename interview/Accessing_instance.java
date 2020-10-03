package interview;

import java.util.Scanner;

public class Accessing_instance{

	public static void main(String[] args) { 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scan.next();
		char[] m=s.toCharArray();
		char a;
		int count=1;
		scan.close();
	for (int i=s.length()-1;i>0;i--)
	{
		for(int j=i-1;j>=0;j--)
		{
			if (m[i]>m[j])
		{ 
			a=m[j];
			m[j]=m[i];
			m[i]=a;
			 count++;
			 break;
			 }
		else
			break;
		}
		if (count==2)
			break;
	}
	for(int i=0;i<=m.length-1;i++)
		System.out.print(m[i]);
	}
	}