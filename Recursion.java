package Basic;

public class Recursion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<10; i++)
		{
			System.out.println(sumCond2(1,i,1!=2));
		}

	}
	
	public static int sumCond2(int one, int two, Boolean check)
	{
		if (one==0)
			return two;
		else if (two==0)
			return one;
		else
		{
			if(check)
			  return one+two;
		    else
			  return one*two;
		}
		
		
	}

}
