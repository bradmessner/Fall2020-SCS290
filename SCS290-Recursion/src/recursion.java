// Project:		Recursion
// Name:		Brad D. Messner
// Version:		1.0
// Date:		Sep 24, 2020
// Desc: 		This is just an example of recursion

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Factorial of 5: " + factorial(5));;
		System.out.println("\n\n");
		countup(10);
		System.out.println("\n\n");
		cups(40);
		
	}
	
	
	public static long factorial(int n)
	{
		System.out.println("Current Number: " + n);
		if (n == 1) 
			return 1; 
		else
		{
			
	    return n * factorial(n-1);
		}
	}
	/*
		 factorial(5) 
		   factorial(4) 
		      factorial(3) 
		         factorial(2) 
		            factorial(1) 
		               return 1 
		            return 2*1 = 2 
		         return 3*2 = 6 
		      return 4*6 = 24 
		   return 5*24 = 120
	 */
	
	public static void countup(int n) {
	    if (n == 0) {
	        System.out.println("Begin Counter!");
	    } else {
	        countup(n - 1);
	        System.out.println(n);
	    }
	}
	
	
	public static int cups(int c)
	{
		System.out.println(c + " cups of tea in Brad's office.");
		if(c==0)
			return 0;
		else
		{
			//System.out.println("Take one out, drink it down. " + (c-1) + " cups in Brad's office.");
			return cups(c-1); 
		}
	}

}
