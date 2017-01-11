package Basic;

public class RecursionArrays2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayOfInts[] = new int[10];
		
		//populate
		for(int i=0; i<arrayOfInts.length; i++)
		{
			arrayOfInts[i]=i+1;
			System.out.println(arrayOfInts[i]);
		}
		
		//multiply by 10
		for (int i=0; i<arrayOfInts.length; i++)
		{
			arrayOfInts[i] *= 10;
			System.out.println(arrayOfInts[i]);
		}

	}

}
