package interview;

public class ByteAddtion {

	public static void main(String[] args) {
		byte a=9;
		byte b=9;
		byte result=(byte)(a+b);
		System.out.println(result);
		//byte result=(a+b);
		//  THE ABOVE LINE GIVES U ERROR  BECAUSE + CAN ONLY BE USED MIN 
		// WITH INTERGERS SO THE RESULT WILL BE INTEGER .
		//  SO  WE SHOULD DO TYPE CONVERSION.
		byte c=127;
		byte d=50;
		byte result1=(byte)(c+d);
		System.out.println(result1);
		
		byte e=127;
		byte f=127;
		byte result2=(byte)(e+f);
		System.out.println(result2);
		
		byte g=-127;
		byte h=-128;
		byte result3=(byte)(g+h);
		System.out.println(result3);
		
	}

}
