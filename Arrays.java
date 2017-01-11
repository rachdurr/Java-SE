package Basic;

public class Arrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayOfInts = {5,6,33,45,50,7,28,64,91,89};
		
		
		System.out.println(sumCond2(arrayOfInts[0],arrayOfInts[1],true));
		System.out.println(sumCond2(arrayOfInts[1],arrayOfInts[2],true));
		System.out.println(sumCond2(arrayOfInts[2],arrayOfInts[3],true));
		System.out.println(sumCond2(arrayOfInts[3],arrayOfInts[4],true));
		System.out.println(sumCond2(arrayOfInts[4],arrayOfInts[5],true));
		System.out.println(sumCond2(arrayOfInts[5],arrayOfInts[6],true));
		System.out.println(sumCond2(arrayOfInts[6],arrayOfInts[7],true));
		System.out.println(sumCond2(arrayOfInts[7],arrayOfInts[8],true));
		System.out.println(sumCond2(arrayOfInts[8],arrayOfInts[9],true));
		System.out.println(sumCond2(arrayOfInts[9],arrayOfInts[0],true));

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
