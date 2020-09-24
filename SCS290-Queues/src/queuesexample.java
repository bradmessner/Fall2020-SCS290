
import java.util.*;

public class queuesexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Notice we create the queue of strings as a Linked List
		Queue<String> q = new LinkedList<String>();

		//Adding elements to the Queue
		q.add("Ashly");
		q.add("Joshua"); 
		q.add("David");
		q.add("John");
		q.add("Sandy");

		System.out.println("Elements in Queue:"+q);

		// Remove item from FRONT of queue
		System.out.println("Removed element: "+q.remove());

		// Returns the item at the FRONT of the queue (does not remove)
		System.out.println("Head: "+q.element());

		// Remove an item from front of queue
		// Returns null if queue is empty
		System.out.println("poll(): "+q.poll());

		// Returns the item at the front of queue
		// Returns null if queue is empty
		System.out.println("peek(): "+q.peek());

		System.out.println("Elements in Queue:"+q);
	}

}
