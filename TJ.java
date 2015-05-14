class Tj
{
	public static void main(String []args)
	{
	
 outer:	for (int i =0 ; i<10;i++)
		{
			for(int j =0; j<10;j++)
			{
				if(j>i)
				{
					System.out.println();
					break;
				}
				
				System.out.print(i*j + " ");
			}
		}
	}
}

/*

  0
  0 1
  0 2 4  */