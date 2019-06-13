# Storage-System-using-Generics
Implementation of a storage system which allows to store and remove items using generics.

## Part 1
The following methods of a storage system are implemented:</br>

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

boolean       add(E e)    : add e to the set </br>                          
boolean       addAll()    : add all elements of the set </br>               
boolean       removeAll() : remove all elements of the set </br>              
Object[]      toArray()   : return all elements of the set in an array </br>    
boolean       contains(Object o) : true if o is in the set, false else </br>
boolean       remove(Object o)   : remove o, true if o could be removed </br>
void          clear()     : empty the set </br>                                 
int           size()      : # of elements in the set </br>                    
