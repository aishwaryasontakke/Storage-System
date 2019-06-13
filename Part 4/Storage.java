/* 
 * Storage.java 
 * 
 * Version: 
 *       4 
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
	Node<E> root=null;
	
	/**
     *  This method adds the specified element to the list.
     *     
     * @param   e   		Element to be added to the list.    
     * @return boolean 		Return true if element is successfully added to list.   
    */
    public boolean add(E e){
    root=addR(root,e);
    return true;    	
    }
 
    /**
     *  This method is recursively called to add the specified element at the 
     *  correct postion in the binary tree.
     * @param   current         Node to be checked.
     * @param   value           Element to be added to the list.    
     * @return boolean      Return true if element is successfully added to list.   
    */
    public Node<E> addR(Node<E> current, E value){
    	if(current==null){
    		Node<E> n=new Node<E>(value);
    		current=n;
    		return current;
    	}
    	else if(value.hashCode()<current.value.hashCode()){
    		current.left=addR(current.left,value);
    	}
    	else if(value.hashCode()>current.value.hashCode()){
    		current.right=addR(current.right,value);
    	}
    	return current;
     }


    /**
      * This method is used to get the elements in the list
      *
      * @param   -      -
      *
      * @return  E      Returns the element in the Storage.
      *
      */
     public E get(){
     	elements(root);
     	return null;
     }

    /**
      * This method is used to print the elements in the list
      *
      * @param   Node current       Node used fr traversing
      *
      * @return  void               This method does not return any type.
      *
      */
     public void elements(Node current){
             if(current!=null){
     		elements(current.left);
     		System.out.print(current.value + " ");
     		elements(current.right);
     	}
     }

    /**
     *  Returns the number of elements in this list.
     *
     * @param       -      
     * @return      int     The number of elements in the list
    */
     public int size(){
     	return root.counter;
     }	

    /**
     *  Removes all of the elements from this list.
     *
     * @param   -        
     * @return  -       The method does not return any type.   
     */
     public void clear(){
        root=null;
        root.counter=0;
        System.out.println("Clear.");
     }

    /**
      * Checks whether the passed element is present in the Storage.
      *
      * @param   E e        The element to be checked.
      *
      * @return  boolean    The method returns true for successful
      *                     removal of all the elements else false.    
      */
     public boolean contains(E e){
        boolean result=RecContains(root,e);
        return result;
     }

    /**
      * Helper method for the contains method
      *
      * @param   E e                    The element to be checked.
      * @param   Node<E> current        The element to be checked.
      * @return  boolean                The method returns true if the element
      *                                 is found else false.       
      */
     public boolean RecContains(Node<E> current, E value){
        if(current.value==value){
            return true;
        }
        else if(value.hashCode()>current.value.hashCode()){
            if(current.right==null){
                return false;
            }
            else{
                return RecContains(current.right,value);
            }
        }
        else if(value.hashCode()<current.value.hashCode()){
            if(current.left==null)
                return false;
            else
                return RecContains(current.left,value);
        }
        return false;
     }

    /**
     *  This method checks whether the list is empty or not.
     *     
     * @param   -   
     * 
     * @return boolean      Return true if the list is empty else return false.
     *
     */
     public boolean isEmpty(){
        return root==null?true:false;
     }

    /**
      * Sorts the elements in the Storage.
      *
      * @param   -      -
      *
      * @return  void   This method does not return any type.
      */
     public void sort(){
        elements(root);
     }

    /**
      * This method is used to get the classname of the particular object.
      *
      * @param   -          -
      *
      * @return  String     Returns the class name of the object.
      *
      */
     public String getClassName(){
        return root.value.getClass().getName();
     }
}