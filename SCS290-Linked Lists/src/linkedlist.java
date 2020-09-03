// Project:		Linked Lists
// Name:		Brad D. Messner
// Version:		1.0
// Date:		Sep 2, 2020
// Desc: 		This is just an example of a linked list

import java.util.*;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();

		//Adding elements to the Linked list
		list.add("Brad");
		list.add("Dioh");
		list.add("Kevin");

		//Adding an element to the first position
		list.addFirst("Germaine");

		//Adding an element to the last position
		list.addLast("Lucas");

		//Adding an element to the 3rd position
		list.add(2, "Dan");

		//Iterating LinkedList
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		// Remove the first element
		// list.removeFirst();

	    // Remove Last element
	    // list.removeLast();

		// Remove the second element
	    // list.remove(1);
		
	} 


}


