package interview;

public class Swap {

	public static void main(String[] args) {
		int x=200;
		int y=100;
		System.out.println("out put is  :");
		System.out.println("before swapping :");
		System.out.println("the value of x is "+" "+x);
		System.out.println("the value of y is "+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping :");
		System.out.println("the value of x is "+" "+x);
		System.out.println("the value of y is "+" "+y);
	}

}
