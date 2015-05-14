class Draw
{

	private int i;
	private int j;
		
	Draw(int a,int b)
	{
		this.i = a;
		this.j = b;
	}
	
	void setij(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	
	void display()
	{
		System.out.println("Values are " + i + " " + j);
	}
}

class Child extends Draw
{
	int k;
	
	Child(int i,int j, int k)
	{
		super(i,j);
		this.k = k;
	}
	
	void display()
	{
		super.display();
		
		System.out.println("Value of k is "+ k);
	}
		
		
		
	public static void main(String [] args)
	{
		Draw d = new Child(10,20,30);
		d.display();
		
	}
}