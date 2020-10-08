// Project:		Priority Queues with Classes
// Name:		Brad D. Messner
// Version:		1.0
// Date:		Sep 24, 2020
// Desc: 		This is just an example of a priority queue leveraging a class

import java.util.*; 

public class pqc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the 'Rona Risk Rating System");
		
		// Create our priority queue of size 10 and assign a custom comparison method
		PriorityQueue<Student> pq = new PriorityQueue<Student>(10, new StudentComparator()); 

		// Student 1 object with a risk rating applied. 
		Student student1 = new Student("Jimmy", 3.2); 
		// Adding student 1 to queue 
		pq.add(student1); 
		Student student2 = new Student("Peggy", 6.6); 
		pq.add(student2);          
		Student student3 = new Student("Brad", 1.0); 
		pq.add(student3); 
		Student student4 = new Student("Adam", 4.0); 
		pq.add(student4); 
		Student student5 = new Student("Eve", 2.5); 
		pq.add(student5); 
		
		System.out.println("Students served in their risk order (highest to lowest):"); 

		while (!pq.isEmpty()) { 
			System.out.println(pq.poll().getName()); 
		}
		
		System.out.println("\n\n*** All names are fictitious. \nSimilarities or likenesses to real persons are purely coincidence.");
	}
}
		// OVERRIDING
		class StudentComparator implements Comparator<Student>{ 

			// Overriding compare()method of Comparator  
			// for descending order of risk
			public int compare(Student s1, Student s2) { 
				if (s1.risk < s2.risk) 
					return 1; 
				else if (s1.risk > s2.risk) 
					return -1; 
				return 0; 
			} 
		} 


	

