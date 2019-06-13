/* 
 * Storage.java 
 * 
 * Version: 
 *       1 
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
	static Storage head;

	// Counter specifies the number of elements in the list. 	
	static int counter=0;

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
     * @return boolean 		Return true if element is successfully added to list.   
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

			Storage nextElement=new Storage();
			nextElement.data=e;
			nextElement.next=head;

			//Update the head position to new element inserted in the list
			head=nextElement;
			counter++;
			return true;
		}
	}

	/**
     *  Inserts the specified element at the specified position in this list.
     *
     * @param  index  		Position to add an element at.    
     * @param  element   	element to add to the list
     * @return ---- 		The method does not return any type.
    */
	public void add(int index, E element){

		//Check if given index is present in the list
		if(counter>index){

			int temp=counter;
			Storage stemp=head;

			//Travese through the list from head till given index
			while(temp!=index+1){
				stemp=stemp.next;
				temp--;
			}
			// s object to be added to the list
			Storage s=new Storage();

			//Store the refrence of index+1 in new element's next
			s.next=stemp.next;

			//Store the reference for new element 
			stemp.next=s;
			s.data=element;
			counter++;
		}

		else{
			System.out.println("Invalid index no");
		}
		if(counter==0){
			System.out.println("List is empty");
		}
	}

	/**
     *  Appends the specified element to the end of this list.
     *
     * @param   e 			Element to be inserted .   
     * @return ---- 		The method does not return any type.    
    */
	void addLast(E e){

		if(counter==0){
			System.out.println("List is empty");
		}
		else{
			// s object to be added to the list
			Storage s=new Storage();
			//First corresponds to the last element of the list.
			first.next=s;
			s.data=e;
			//Sets the next of the inserted element to null
			s.next=null;
			first=s;
			counter++;
		}
	}

	/**
     *  Inserts the specified element at the beginning of this list
     *
     * @param       e 			Element to be inserted .       
     * @return  	---- 		The method does not return any type.    
    */
	void addFirst(E e){

		// s object to be added to the list
		Storage s=new Storage();
		//Store the element's data in data and set its next to head
		s.data=e;
		s.next=head;

		//Changes the head of the list to added element.
		head=s;
		counter++;

	}

	/**
     *  Removes all of the elements from this list.
     *
     * @param   ---           
     * @return  ---- 		The method does not return any type.   
    */
	void clear(){

		//Sets the head to null
		head=null;
		counter=0;
		System.out.println("List clear.");
	}

	/**
     *  Retrieves, but does not remove, the head (first element) of this list.
     * @param   ---           
     * @return  ---- 		The method does not return any type.   
    */
	void element(){

		//Head element is stored in variable head.
		if(counter==0){
		System.out.println("List is empty");
		}
		else{
			System.out.println("Head of list is :"+head.data);
		}
	}

	/**
     *  Retrieves and removes the head (first element) of this list.
     *
     * @param   ---           
     * @return  ---- 		The method does not return any type.       
    */
	void remove(){
		if(counter==0){
		System.out.println("List is empty");
	}else{
		Storage s=head;

		//Set the new head to head.next and remove it.
		head=head.next;
		System.out.println("Head removed :"+s.data);
		counter--;		
	}
	}

	/**
     *  Removes the element at the specified position in this list.
     *
     * @param   index       Index value of the element to remove.     
     * @return  ---- 		The method does not return any type.       
    */
	void remove(int index){
		if(counter==0){
			System.out.println("List is empty");
		}
		else{
				int temp=counter;
				Storage stemp=head;
				//Removing last element of the list
				if(index==0){

					//Traverse till index value+2
					while(temp!=index+2){	
						stemp=stemp.next;
						temp--;
					}
					stemp.next=null;
				}
			
				else if(counter>index){
				//Traverse till index value+1
					while(temp!=index+1){	
						stemp=stemp.next;
						temp--;
					}

					Storage s=new Storage();
					//Change the next values of index +1 and index -1
					s=stemp.next;
					stemp.next=s.next;
					counter--;
				}
			else{
				System.out.println("Invalid index no");
			}
		}	
	}

	/**
     *  Returns the number of elements in this list.
     *
     * @param       ---      
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
			System.out.println("Empty list");
		}
	}
}