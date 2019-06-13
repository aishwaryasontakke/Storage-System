/* 
 * StorageList.java 
 * 
 * Version: 
 *       1
 * 
 * Revisions: 
 *       1
 */

/**
 * This program implements a storage system which allows to storage and remove
 * items using generics.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */
 
import java.util.Scanner;
public class StorageList{
    
    /**
     * The main program.
     *
     * @param    args    command line arguments (ignored)
     */
   	public static void main(String args[]){

   		//boolean variable to conitnue program execution
		Boolean yes=true;
		String element;
		Scanner sc=new Scanner(System.in);
		int choice;
		int index;
		
		Storage <String>demo=new Storage <String>();
		
		//While the user wants to continue.
		while(yes){
			System.out.println("Enter your choice.");
			System.out.println("1.  Add an element \n2.  Add an element at an index\n"
				+"3.  Add element at the beginning of list \n4.  Add element at the end "
				+"of list\n5.  Clear list \n6.  Get first element of list \n7.  Remove "
				+"list head \n8.  Remove element at an index\n9.  Get size of list\n10. "
				+"Display list\n11. Exit");
			choice=sc.nextInt();
			sc.nextLine();

			//Depending upon the user choice perform the corresponding case.
			switch(choice){
				case(1) :
						System.out.println("Enter element to add");		
						element=sc.nextLine();
						demo.add(element);
						break;
				case(2) :
						System.out.println("Enter element to add");
						element=sc.nextLine();
						System.out.println("Enter index value");
						index=sc.nextInt();
						demo.add(index,element);
						break;
				case(3):
						System.out.println("Enter element to add");
				 		element=sc.nextLine();
				 		demo.addFirst(element);
						break;
				case(4): 
						System.out.println("Enter element to add");
				 		element=sc.nextLine();
						demo.addLast(element);
						break;
				
				case(5):
						demo.clear(); 
						break;
				case(6): 
						demo.element();
						break;
				case(7):
						demo.remove();
						break;
				case(8):
						System.out.println("Enter index value of element to remove");
						index=sc.nextInt();
						demo.remove(index);
						break;
				case(9): 
						System.out.println("Size of list is "+demo.size());
						break;
				case(10): 
						demo.print();
						break;

				case(11):
						yes=false;
						break;
			}
		}
	}	
}