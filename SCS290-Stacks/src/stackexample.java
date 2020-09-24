// Name:	Generic Class with Stacks
// Author:	Brad D. Messner
// Version:	1.0
// Date:	September 18, 2020

import java.util.Scanner;

public class stackexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare variables
		char menuChoice;
		int size = 1;
		int remove = 1;
		Scanner keyboard = new Scanner(System.in);
		boolean variableName = true;

		do
		{
			System.out.flush(); 
			System.out.println("Main Menu\n==== ====");
			System.out.println("A.) Create a Batter Line Up");
			System.out.println("B.) Create a Temperature Tracker");
			System.out.println("C.) Exit");
			System.out.print("Selection: ");
			menuChoice = keyboard.next().charAt(0);
			
			if(menuChoice!='C')
			{
				System.out.print("How large would you like it: ");
				size = keyboard.nextInt();
				
				System.out.print("How many would you like to remove: ");
				remove = keyboard.nextInt();
			}
			
			switch(menuChoice)
			{
				case 'A':
					StackStorage players = new StackStorage(size);
					players.removeItems(remove);
					break;
				case 'B':
					StackStorage temperature = new StackStorage(size);
					temperature.removeItems(remove);
					break;
				case 'C':
					System.out.println("Have a great day.");
			}
			
			
			
		} while (menuChoice !='C');
		
		// Close the keyboard
		keyboard.close();
		
	}

}
