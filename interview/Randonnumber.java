package interview;
import java.util.Random;
public class Randonnumber {

	public static void main(String[] args) {
		Random generator = new Random();
		for(int i=0;i<10;i++) {
			int ran=generator.nextInt(1000);
			System.out.println("random numbers are: "+ ran);
		}

	}

}
