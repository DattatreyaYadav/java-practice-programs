package interview;
import java.util.Scanner;
public class Oddandeven {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("enter a number::");
		int num=sc.nextInt();
		System.out.println("print even and odd numbers");
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i+" even number ");
			}else {
				System.out.println(i+ " odd number ");
			}
			sc.close();
		}
}
}

