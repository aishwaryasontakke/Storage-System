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

public class Storage<E> implements StorageI<E>{

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
			if(check(e)){
			Storage nextElement=new Storage();
			nextElement.data=e;
			nextElement.next=head;

			//Update the head position to new element inserted in the list
			head=nextElement;
			counter++;

			return true;
		}
			else{
				return false;
			}
		}
	}

	/**
     *  This method checks whether the entered element is already in the list.
     *     
     * @param   e   		Element to be added to the list.   
     * 
     * @return boolean 		Return true if the passed element is not present
     *						already else return false.
     */
	public boolean check(E e){
		Storage temp=head;
			while(temp!=null){
				if(temp.data.equals(e)){
					return false;
				}
				temp=temp.next;
			}
			return true;
	}

	/**
     *  Removes all of the elements from this list.
     *
     * @param   -        
     * @return  - 		The method does not return any type.   
     */
	public void clear(){

		//Sets the head to null
		head=null;
		counter=0;
		System.out.println("Clear.");
	}

	/**
     *  This method checks whether the list is empty or not.
     *     
     * @param   -	
     * 
     * @return boolean 		Return true if the list is empty else return false.
     *
     */
	public boolean isEmpty(){
		return head==null?true:false;
	}

	/**
     *  Removes the passed element.
     *
     * @param   E toRemove      Element to be removed.
     *    
     * @return  boolean 		The method returns true on successful removal of
     *							the element else returns false.       
     */
	public boolean remove(E toRemove){	
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
	public boolean removeAll(Storage bStorage){
		Storage temp=bStorage.head;
		Storage temp2=this;
		while(temp!=null){
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
	public boolean addAll(Storage bStorage){
		Storage temp=bStorage.head;
		Storage temp2=this;
		while(temp!=null){
			temp2.add(temp.data);
			temp=temp.next;
		}
		return true;
	}

	/**
      * Checks whether the passed element is present in the Storage.
      *
      * @param   E e		The element to be checked.
      *
      * @return  boolean 	The method returns true if the element is found
      *						else false.    
      */
	public boolean contains(E e){
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
	public void toArray(){
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
      * Sorts the elements in the Storage.
      *
      * @param   -		-
      *
      * @return  void	This method does not return any type.
      */
	public void sort(){

		//Creating an array of size of list.
		Object array[]= new Object[this.counter];
		Storage t=head;
		int i=0;
		Object temp;

		//Storing the elements in the array
		while(t!=null){
			array[i]=t.data;
			i++;
			t=t.next;
		}

		//Sorting the elements based on their hashCode.
		for(int k=0;k<array.length;k++){
			for( int j=k+1;j<array.length;j++){
				if(array[k].hashCode()>array[j].hashCode()){
					temp=array[k];
					array[k]=array[j];
					array[j]=temp;
				}
			}
		}

		//Storing the sorted array.
		Storage temp9=this.head;
		temp9.data=head.data;
		for(int k=0;k<array.length;k++){
			temp9.data=array[k];
			temp9=temp9.next;
		}
	}

	/**
      * This method is used to get the elements in the list
      *
      * @param   -		-
      *
      * @return  E		Returns the element in the Storage.
      *
      */
	public E get(){		
		return this.data;
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
      * This method is used to get the classname of the particular object.
      *
      * @param   -			-
      *
      * @return  String		Returns the class name of the object.
      *
      */
	public String getClassName(){
		Storage s=head;		
		return s.data.getClass().getName();
	}

	/**
     *  Prints the elements in the list
     *
     * @param  -  
     * @return -  	Does not return any type.   
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