// Project:		Priority Queues
// Name:		Brad D. Messner
// Version:		1.0
// Date:		Sep 24, 2020
// Desc: 		This is just an example of a priority queue

import java.util.*; 
import java.io.*; 

public class pqueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		PriorityQueue<Integer> pq = new PriorityQueue<>(); 
		  
		System.out.println("Loading Players in Class");
        pq.add(45); 
        pq.add(23); 
        pq.add(5);
        pq.add(14);
        pq.add(89);
        pq.add(90);
        pq.add(23);
        pq.add(66);
  
        System.out.println("Team Roster: " + pq);
        System.out.println("");
  
        System.out.println("Oh uh. Player 89's roommate is quaratining.  Player 89 cannot play tonight.");
        pq.remove(89); 
        System.out.println("");
  
        System.out.println("Tonight's Roster: " + pq); 
        System.out.println("");
  
        System.out.println("Oh uh. The first person to enter the locker room fell into quicksand and cannot attend.");
        System.out.println("That Person: " + pq.poll()); 
        // pq.peek() could be used to just look at the first element
        System.out.println("");
  
        System.out.println("Tonight's Final Roster: " + pq); 
	}

}
