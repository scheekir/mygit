
class Box
{
	
	int h;
	int w;
	int l;
	
	Box(int h, int w, int l)
	{
			this.h = h;
			this.w = w;
			this.l = l;
			
	}
	
	Box()
	{
		h=w=l = 10;
	}
	
	double volume()
	{
		return h*w*l;
	}
	
	void print(double d, float f)
	{
		System.out.println("In double d and float f");
	}
	
	int print(int j, double k)
	{
		System.out.println("In in and double k");
		return 1;
	}
}

class Test
{
	public static void main(String []args)
	{
		Box b = new Box();
		System.out.println(b.volume());
		
		b.print(10, 2.3);
	}
}