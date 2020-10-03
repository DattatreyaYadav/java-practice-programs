package interview;
import java.util.Scanner;
public class PascalsTriangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of rows ");
		int rows=scan.nextInt();
		System.out.println("PASCALS TRIANGLE ");
        for(int i=0;i<rows;i++)
        {
        	for(int j=0;j<rows-1-i;j++)
        	{
        		System.out.print(" ");
        	}
        	int number=1;
            for(int k=0;k<=i;k++)
            {
               System.out.print(number+" "); 	
               number=(number*(i-k))/(k+1);
            }
            System.out.println();
        }
        scan.close();
	}

}
