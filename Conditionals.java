package Basic;

public class Conditionals {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumCond(2,3,2==1)); //false
		System.out.println(sumCond(3,4,5<6)); //true
	}
	
	public static int sumCond(int one, int two, Boolean check)
	{
		if(check)
			return one+two;
		else
			return one*two;
	}

}
