import java.lang.*;

public class T
{
	public static void main (String []args)
	{
		int i = 0;
		long j =4294967297l;
		
		byte b=0;
		double k = 578;
		
		b =(byte) k;
		i = (int)j;
		
		System.out.println(i);
		
		System.out.println(b);
		
	}
}