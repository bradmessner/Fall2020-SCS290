/**
    A class that implements a bag of objects by using an array.
    INCOMPLETE DEFINITION; includes security checks and definitions for
    the methods isEmpty, getCurrentSize, getFrequencyOf, and contains.
    @author Frank M. Carrano, Timothy M. Henry
    @version 5.0
*/
public final class ArrayBag2<T> implements BagInterface<T>
{
	private final T[] bag;
	private int numberOfEntries;
   private boolean integrityOK = false;
	private static final int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 10000;
   
	/** Creates an empty bag whose initial capacity is 25. */
	public ArrayBag2()
	{
		this(DEFAULT_CAPACITY);
	} // end default constructor
   
	/** Creates an empty bag having a given capacity.
       @param desiredCapacity  The integer capacity desired. */
	public ArrayBag2(int desiredCapacity)
	{
      if (desiredCapacity <= MAX_CAPACITY)
      {
         // The cast is safe because the new array contains null entries
         @SuppressWarnings("unchecked")
         T[] tempBag = (T[])new Object[desiredCapacity]; // Unchecked cast
         bag = tempBag;
         numberOfEntries = 0;
         integrityOK = true;
      }
      else
         throw new IllegalStateException("Attempt to create a bag whose" +
                                         "capacity exceeds allowed maximum.");
	} // end constructor
   
	/** Adds a new entry to this bag.
       @param newEntry  The object to be added as a new entry.
       @return  True if the addition is successful, or false if not. */
	public boolean add(T newEntry)
	{
		checkIntegrity();
      boolean result = true;
      if (isArrayFull())
      {
         result = false;
      }
      else
      {  // Assertion: result is true here
         bag[numberOfEntries] = newEntry;
         numberOfEntries++;
      } // end if
      
      return result;
	} // end add
   
	/** Retrieves all entries that are in this bag.
       @return  A newly allocated array of all the entries in this bag. */
	public T[] toArray()
	{
		checkIntegrity();
      
      // The cast is safe because the new array contains null entries.
      @SuppressWarnings("unchecked")
      T[] result = (T[])new Object[numberOfEntries]; // Unchecked cast
      
      for (int index = 0; index < numberOfEntries; index++)
      {
         result[index] = bag[index];
      } // end for
      return result;
      // Note: The body of this method could consist of one return statement,
      // if you call Arrays.copyOf
	} // end toArray
   
	/** Sees whether this bag is empty.
       @return  True if this bag is empty, or false if not. */
	public boolean isEmpty()
	{
      return numberOfEntries == 0;
	} // end isEmpty
   
	/** Gets the current number of entries in this bag.
       @return  The integer number of entries currently in this bag. */
	public int getCurrentSize()
	{
      return numberOfEntries;
	} // end getCurrentSize

	/** Counts the number of times a given entry appears in this bag.
       @param anEntry  The entry to be counted.
       @return  The number of times anEntry appears in this ba. */
	public int getFrequencyOf(T anEntry)
	{
		checkIntegrity();
      int counter = 0;
      
      for (int index = 0; index < numberOfEntries; index++)
      {
         if (anEntry.equals(bag[index]))
         {
            counter++;
         } // end if
      } // end for
      
      return counter;
	} // end getFrequencyOf
   
	/** Tests whether this bag contains a given entry.
       @param anEntry  The entry to locate.
       @return  True if this bag contains anEntry, or false otherwise. */
   public boolean contains(T anEntry)
	{
		checkIntegrity();
      boolean found = false;
		int index = 0;      
      while (!found && (index < numberOfEntries))
		{
			if (anEntry.equals(bag[index]))
			{
				found = true;
			} // end if
         index++;
		} // end while
      return found;
   } // end contains
   
	/** Removes one unspecified entry from this bag, if possible.
       @return  Either the removed entry, if the removal
                was successful, or null. */
	public T remove()
   {
      return null; // STUB
   } // end remove
   
	/** Removes one occurrence of a given entry from this bag.
       @param anEntry  The entry to be removed.
       @return  True if the removal was successful, or false if not. */
   public boolean remove(T anEntry)
   {
      return false; // STUB
   } // end remove
	
	/** Removes all entries from this bag. */
	public void clear()
   {
      // STUB
   } // end clear
   
   // Returns true if the array bag is full, or false if not.
	private boolean isArrayFull()
	{
		return numberOfEntries >= bag.length;
	} // end isArrayFull
   
   // Throws an exception if this object is not initialized.
   private void checkIntegrity()
   {
      if (!integrityOK)
         throw new SecurityException("ArrayBag object is corrupt.");
   } // end checkIntegrity
} // end ArrayBag2



