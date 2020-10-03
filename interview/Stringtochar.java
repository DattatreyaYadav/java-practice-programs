package interview;

public class Stringtochar {

	public static void main(String[] args) {
	String str="dattatreya";
	System.out.println("the string is ::"+ str);
	int strlen=str.length();
	for (int i=0;i<strlen;i++) {
		char mychar=str.charAt(i);
		System.out.println("character at "+i+ " position  " +mychar);
	}

	}

}
