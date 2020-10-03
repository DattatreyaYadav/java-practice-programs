package interview;

import java.util.*;

public class Sortstring {

	public static void main(String[] args) {
		 
		System.out.println("enter the srting to get reversed :");
		
		Scanner scan =new Scanner(System.in);
		String s1=scan.nextLine();
		sort(s1);
	}
	 public static void sort(String s) {
		 char ar[]=s.toCharArray();
		 char temp;
		 for(int i =0;i<=ar.length-2;i++) {
			 for(int j = 0;j<=ar.length-1;i++) {
				 if(ar[i]>ar[j]) {
					 temp=ar[i];
					 ar[j]=ar[i];
					 ar[i]=temp;
				 }
			 }
			 
		 }
		 for(int i =0;i<=ar.length-1;i++)
			 System.out.println(ar[i]);
	}
	
}
