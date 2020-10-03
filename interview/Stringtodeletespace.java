package interview;
import java.util.* ;
public class Stringtodeletespace {

	public static void main(String[] args) {
		System.out.println("enter a string to remove spaces between string");
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		System.out.println(s1);
		int len=s1.length();
	    String rem="";
	    for(int i=0;i<len;i++)
	    {
	      if(s1.charAt(i)!=' ') 
	    		rem+=s1.charAt(i);   	
	    }
		System.out.println(rem);

	}
	

}
