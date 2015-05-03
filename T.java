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
		
		
		int[] a = new int[]{10,5,78,9,32,24};
		
		for(i = 0 ; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
				
	}
}