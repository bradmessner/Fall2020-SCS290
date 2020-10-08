// Brad D. Messner
// October 8, 2020
// Dictionaries

import java.util.*;

public class dictionaries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create the dictionary
		Hashtable<String, String> shuCourses = new Hashtable<String,String>();

		// Populate the dictionary
		shuCourses.put("SCS", "Computer Science");
		shuCourses.put("SCY", "Cybersecurity");
		shuCourses.put("SDT", "Data Analytics");
		shuCourses.put("SDS", "Data Science");
		shuCourses.put("SMA", "Mathematics");
		shuCourses.put("STV", "Travel Services");
		
		// Output some results
		System.out.println("SCS stands for: " + shuCourses.get("SCS"));

		// Delete Travel Services
		System.out.println("Sorry, we had to cancel: " + shuCourses.get("STV"));
		shuCourses.remove("STV");
		
		// Does a value exist?
		System.out.println("Does STV still exist? " + shuCourses.get("STV"));
	
		// Is the dictionary empty?
		System.out.println("Is my dictionary empty? " + shuCourses.isEmpty());
		
		// How many items are in my dictionary?
		System.out.println("I have " + shuCourses.size() + " items in my dictionary.");
	
		// Empty my dictionary
		shuCourses.clear();
		System.out.println("I have " + shuCourses.size() + " items in my dictionary.");
		
	}

}
