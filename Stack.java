class Stack
{
	private int tos;
	private int [] inStack;
	
	public Stack(int size)
	{
		tos = -1;
		inStack = new int[size];
	}

    public void push(int i)
	{
		if(tos == inStack.length-1)
		{
			System.out.println("Stack is full");
		}
		else
		{
			inStack[++tos] = i;
			
		}
		
	}	

	public int pop()
	{
		if(tos == -1)
		{
			System.out.println("Stack is empty");
			 return -1;
		}
		else
		return inStack[tos--];
		
	}
	
	
	public void displayStack()
	{
		for(int i=tos;i>=0;i--)
		 System.out.println(inStack[i]);
	}
	
	public static void main(String []args)
	{
		Stack st = new Stack(5);
		
		st.push(1);
		st.push(2);
		st.displayStack();
		System.out.println();
		System.out.println();
		st.displayStack();
		System.out.println();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println();
		st.displayStack();
		
	}
}