
class Stest
{
	static int a;
	int b =10;
	
	Stest()
	{
		
		
	}
	
	void print()
	{
		System.out.println("Value of b: " + a);
	}
	
	public static void main(String []args)
	{
		Stest s = new Stest();
		s.print();
	}
}