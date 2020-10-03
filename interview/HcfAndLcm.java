package interview;

public class HcfAndLcm {

	public static void main(String[] args) 
	{
		int n1=24,n2=98;
		int hcf=1;
		int small= (n1<n2) ? n1 : n2;
		for(int i=1;i<=small;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("highest common factor :");
		System.out.println(hcf);
		int lcm= (n1*n2)/hcf;
		System.out.println("least common factor :");
		System.out.println(lcm);
	}

}
