/** 
    A test of the constructors and the methods add and toArray,
    as defined in the first draft of the class ArrayBag.
    @author Frank M. Carrano, Timothy M. Henry
    @version 5.0
*/
public class ArrayBagDemo1
{
	public static void main(String[] args) 
	{
      // Adding to an initially empty bag with sufficient capacity
      System.out.println("Testing an initially empty bag with " +
                         " sufficient capacity:");
		BagInterface<String> aBag = new ArrayBag1<>();
		String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
		testAdd(aBag, contentsOfBag1);

      // Filling an initially empty bag to capacity
      System.out.println("\nTesting an initially empty bag that " +
                         " will be filled to capacity:");
		aBag = new ArrayBag1<>(7);
		String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D",
                                 "another string"};
		testAdd(aBag, contentsOfBag2);
	} // end main
	
   // Tests the method add.
	private static void testAdd(BagInterface<String> aBag, String[] content)
	{
		System.out.print("Adding the following strings to the bag: ");
		for (int index = 0; index < content.length; index++)
		{
			if (aBag.add(content[index]))
            System.out.print(content[index] + " ");
         else
            System.out.print("\nUnable to add " + content[index] +
                             " to the bag.");
		} // end for
      System.out.println();
      
		displayBag(aBag);
	} // end testAdd

   // Tests the method toArray while displaying the bag.
	private static void displayBag(BagInterface<String> aBag)
	{
		System.out.println("The bag contains the following string(s):");		
		Object[] bagArray = aBag.toArray();
		for (int index = 0; index < bagArray.length; index++)
		{
			System.out.print(bagArray[index] + " ");
		} // end for
		
		System.out.println();
	} // end displayBag
} // end ArrayBagDemo1
/*
 Testing an initially empty bag with  sufficient capacity:
 Adding the following strings to the bag: A A B A C A
 The bag contains the following string(s):
 A A B A C A
 
 Testing an initially empty bag that  will be filled to capacity:
 Adding the following strings to the bag: A B A C B C D
 Unable to add another string to the bag.
 The bag contains the following string(s):
 A B A C B C D 
*/
