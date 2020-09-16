// Class Name:	StackStorage
// Purpose:		Generic storage unit

import java.util.*;
import java.util.Random;

public class StackStorage {

	// Declare variables
	public Stack<Integer> stack = new Stack<Integer>();
	Random takeAGuess = new Random();

	public StackStorage(int size)
	{
		// Populate the Stack
		for(int newSize=size;size>0;size--)
		{
			stack.push(takeAGuess.nextInt(100));
		}
		
		// Print the Stack
		System.out.println(stack + "\n");
		
	}
	
	public void addItem(int add)
	{
		stack.push(add);
		System.out.println(stack + "\n");
	}
	
	public void removeItems(int remove)
	{
		while(remove>0)
		{	
			if(!(stack.isEmpty()))
				stack.pop();
			remove--;
		}
		System.out.println(stack + "\n");
	}
	
	public void viewTop()
	{
		System.out.println("Top Item: " + stack.peek());
	}

	
	
}
