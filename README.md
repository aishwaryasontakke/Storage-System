# Storage-System

## Part 1
The following methods of a storage system are implemented using generics:</br>

               boolean add(E e)
               void    add(int index, E element)
               void    addFirst(E e)
               void    addLast(E e)
               void    clear()
               E       element()
               E       remove()
               E       remove(int index)
               int     size()
               
The documentation of the methods can be found at https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html </br>
The system does not have a fixed data size hence a linked list is used. No existing java classes are used in the implementation.

## Part 2
Implementation of a storage system that behaves like a set.</br>

The operations Union and Intersection are defined on sets. It is also possible to ask if x is a member of a set A. x ∈ A is true, if x is a member of A otherwise false.

Following methods are implemented:</br>

               boolean add(E e)     : add e to the set
               boolean addAll()     : add all elements of the set 
               boolean removeAll()  : remove all elements of the set   
               Object[] toArray()   : return all elements of the set in an array 
               boolean contains(Object o) : true if o is in the set, else false
               boolean remove(Object o)   : remove o, true if o could be removed
               void clear()         : empty the set
               int size()           : # of elements in the set
               
## Part 3
Implementation of a storage solution based on a interface and a functionality requirement.

                      public interface StorageI<E>  {
                
                              public boolean add(E e);        // 1
                              public E get();
                              public void clear();            // 1
                              public boolean contains(E e);
                              public boolean isEmpty();
                              public void sort();             
                              public int size();              // 1 
                              public String getClassName();
                      }

After sort() is called, get() must return the elements in order, unless a other element is inserted. The lines in the interface marked with 1, must perform in O(1).

## Part 4

The sort method in Part 3 should run in O(1) time.</br>
Underlying data structure is changed and the elements are sorted while adding itself.
