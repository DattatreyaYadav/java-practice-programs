package interview;

public class Minutes {
	private static final String INVLAID_VALUE_MESSAGE="invalid value";
	public static void main(String[] args) {
		System.out.println(getdurationstring(65,45));
		System.out.println(getdurationstring(6545l));
	}
	public static String getdurationstring(long minutes,long seconds) {
		if ((minutes<0) || (seconds<0) || (seconds>59)) {
			return INVLAID_VALUE_MESSAGE;
		}
		long hours=minutes/60;
		long remmintues=minutes%60;
		String hourstring = hours+"h";
		if(hours<10) {
			hourstring="0"+hours;
		}
		String minstring = remmintues+"m";
		if(remmintues<10) {
			minstring="0"+remmintues;
		}
		String secondstring = seconds+"s";
		if(seconds<10) {
			secondstring="0"+seconds;
		}
		return hourstring+" "+minstring+" "+secondstring;
		
	}
	public static String getdurationstring(long seconds)
	{
		if (seconds<0) {
			return INVLAID_VALUE_MESSAGE;
		}
		long min=seconds/60;
		long remseconds=seconds%60;
		
	   /* String s= getdurationstring(min,remseconds);//this method is a string.
	    return s; 
	    else */
		return getdurationstring(min,remseconds);
		
	    		
	}
}

