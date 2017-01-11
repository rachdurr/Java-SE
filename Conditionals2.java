package Basic;

public class Conditionals2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumCond2(1,0,2==1)); 
		System.out.println(sumCond2(1,2,5<6)); 
		

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
