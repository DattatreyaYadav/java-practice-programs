package interview;

import java.util.Scanner;

public class Countvowandcon 
{
	public static void main(String[] args)
	{
		System.out.println("enter a string to remove spaces between string");
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		System.out.println(s1);
		int len=s1.length();
		int countvowel=0;
		String vowel="";
		String consonant="";
		int countconsonant=0;
		for(int i=0;i<len;i++)
		{
			        if(s1.charAt(i)=='a' || s1.charAt(i)=='A' ||s1.charAt(i)=='e'||
					s1.charAt(i)=='E'||
					s1.charAt(i)=='i' || s1.charAt(i)=='I'||s1.charAt(i)=='o'||
					s1.charAt(i)=='O'
					||s1.charAt(i)=='u'||s1.charAt(i)=='U')
					{
				     countvowel+=1;
				     vowel+=s1.charAt(i);
					} 
			        else if(s1.charAt(i)==' ') 
			        {
			        	continue;	
			        }
			        else
			        {
			         consonant+=s1.charAt(i);
			         countconsonant+=1;
			        }
		}
		System.out.println("the number of vowels in given string is :"+countvowel);
		System.out.println("the vowel string is  : "+vowel);
		System.out.println("the number of consonants in given string is : "+countconsonant);
		System.out.println("the consonant string is : "+consonant);
		scan.close();
	}

}
