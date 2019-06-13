/* 
 * Storage.java 
 * 
 * Version: 
 *       2 
 * 
 * Revisions: 
 *       1
 */

/**
 * This Storage class has various storage system methods which are implemented
 * using generics.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */
 
import java.util.Scanner;

public class Storage<E>{

	// Head points to the begining of the list.
	 Storage head;

	// Counter specifies the number of elements in the list. 	
	 int counter=0;

	// Data to be stored in the list.Can be of any type.
	E data;

	// next points to the next element in the linked list.
	Storage next;	

	// first is the first inserted element of the list.
	Storage first;

	/**
     *  This method appends the specified element to the end of this list.
     *     
     * @param   e   		Element to be added to the list.    
     * @return boolean 		Return true if element is successfully added to
     *						list.   
     */
	public boolean add(E e){
		try{
		//If the list is empty.
		if(counter==0){

			//Create object of storage type to add element to the list.
		 	Storage current=new Storage();

		 	//Store element e in the data variable of the current object.
		 	current.data=e;

		 	//Set first equal to current.
		 	first=current;
			current.next=head;
			head=current;

			//Increment the number of elements present in the list by 1.
			counter++;
			return true;
		}

		//If the list is not empty
		else{ 
			Storage temp=head;
			while(temp!=null){
				if(temp.data.equals(e)){
					return false;
				}
				temp=temp.next;
			}

			Storage nextElement=new Storage();
			nextElement.data=e;
			nextElement.next=head;

			//Update the head position to new element inserted in the list
			head=nextElement;
			counter++;
			return true;
		}
		}
		catch(NullPointerException p){
        System.out.println("Cannot add null to the set.");
    	} 
    	return true;   
	}

	/**
     *  Removes all of the elements from this list.
     *
     * @param   -           
     * @return  - 	The method does not return any type.   
    */
	void clear(){

		//Sets the head to null
		head=null;
		counter=0;
		System.out.println("Clear.");
	}

	/**
     *  Retrieves and removes the passed object of this list.
     *
     * @param   -   -   
     *    
     * @return  -	The method does not return any type.
     *       
     */
	boolean remove(Object o){

		Object toRemove = (E)o;
		if(this.counter==0){
			System.out.println("List is empty");
		}
		else{
			Storage temp=head;
			temp.next=head.next;
			Storage stemp=temp.next;
			temp.data=head.data;

			//Traverse from head till null is found.
			while(temp.next!=null){
				if(temp.data.equals(toRemove))
				{
					stemp.next=temp.next;
					counter--;	
					return true;
				}
				else{
					stemp=temp;
					temp=temp.next;
				}
			}
			if(temp.data.equals(toRemove))
				{	
					stemp.next=temp.next;
					counter--;	
					return true;
				}
		}
		return false;
	}

	/**
      * Removes all the elements of the passed Storage object.
      *
      * @param   Storage bStorage		The storage whose elements are to 
      *									be removed. 
      * @return  boolean				The method returns true for successful
      *									removal of all the elements else false. 
      */
	boolean removeAll(Storage bStorage){
		Storage temp=bStorage.head;
		Storage temp2=this;
		while(temp!=null){

			//Calling the remove method on all elements of bStorage.
			temp2.remove(temp.data);
			temp=temp.next;
		}
		return true;
	}

	/**
      * Add all the elements of the passed Storage object.
      *
      * @param   Storage bStorage		The storage whose elements are to 
      *									be removed. 
      *
      * @return  boolean 				The method returns true for successful
      *									addition of all elements else false.    
      */
	boolean addAll(Storage bStorage){
		Storage temp=bStorage.head;
		Storage temp2=this;
		while(temp!=null){

			//Calling the add method on all elements of bStorage.
			temp2.add(temp.data);
			temp=temp.next;
		}
		return true;
	}

	/**
      * Checks whether the passed object is present in the Storage.
      *
      * @param   Storage bStorage		The storage which is to be checked.
      *
      * @return  boolean 				The method returns true for successful
      *									removal of all the elements else false.    
      */
	boolean contains(Object o){

		Object e = (E)o;
		if(head!=null){
			Storage temp=this.head;
						
			//Traverse from head till null is found.
			while(temp!=null){
				if(temp.data.equals(e)){
					return true;
				}
				else
				temp=temp.next;
			}				
		}
		return false;
	}

	/**
      * Converts the storage object to array.
      *
      * @param   -		-
      *
      * @return  void	This method does not return any type.
      */
	void toArray(){

		//Initializing an array of the size of list.
		Object array[]= new Object[this.counter];
		Storage t=head;
		int i=0;
		while(t!=null){
			array[i]=t.data;
			i++;
			t=t.next;
		}
		System.out.println("Array elements :");
		for(i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
	/**
     *  Returns the number of elements in this list.
     *
     * @param       -      
     * @return      int 	The number of elements in the list
     */
	public int size(){
			return counter;
	}

	/**
     *  Prints the elements in the list
     *
     * @param  ---  
     * @return ---   	Does not return any type.   
     */
	public void print(){
		if(head!=null){
			Storage temp=head;

			//Traverse from head till null is found.
			while(temp.next!=null){
				System.out.print(temp.data+" -> ");
				temp=temp.next;
			}
			System.out.print(temp.data+" -> null");
			System.out.println();
		}
		else{
			System.out.println("Empty set");
		}
	}
}