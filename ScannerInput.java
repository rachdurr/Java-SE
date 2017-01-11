package Basic;

import java.util.Scanner;

public class ScannerInput {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int length = s.nextInt();
		
		
		int arrayOfInts[] = new int[length];
		
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
