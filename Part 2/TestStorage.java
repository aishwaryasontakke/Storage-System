/* 
 * TestStorage.java 
 * 
 * Version: 
 *       2 
 * 
 * Revisions: 
 *       1
 */

/**
 * This TestStorage class has various methods which are used
 * to test the storage system methods in Storage.java
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */
public class TestStorage {

  /**
    * This method shows the execution of all the storage system methods.
    *     
    * @param    Storage<string>     Storage on which various methods are to be
    *                               performed.    
    * @return   void                This method does not return any type.   
    */
  public static void exampleOfHowToUseIt( Storage<String> aStorage){
        aStorage = new Storage<String>();

        aStorage.add("a");
        aStorage.add("b");
        aStorage.add("c");

        testRemove();
        testRemoveAll();
        testContains();
        testAdd();
        testAddAll(); 
        testClear();
        
        System.out.println("\nStorage aStorage:");
        aStorage.print();
        System.out.println("aStorage size: "+aStorage.size());

        System.out.println("\ntoArray method:");
        System.out.println("Storage aStorage:");
        aStorage.print();
        aStorage.toArray();   
  }

  /**
    * This method tests the add() storage method.
    *     
    * @param    -             -
    *   
    * @return   true/false    Method returns false if the test fails else
    *                         it returns true.   
    */
  public static boolean testAdd(){
    System.out.println("\ntestAdd method");
    Storage<String> t4 = new Storage<String>();
    System.out.println("Storage t4");
    t4.print();
    t4.add("a");
    System.out.println("Adding a to Storage t4:");
    t4.print();
    return t4.add("a")?true:false;    
  } 

  /**
    * This method tests the addAll() storage method.
    *     
    * @param    -             -
    *   
    * @return   true/false    Method returns false if the test fails else
    *                         it returns true.   
    */
  public static boolean testAddAll(){
    System.out.println("\ntestAddAll method");
    Storage<String> t5 = new Storage<String>();
    Storage<String> b5 = new Storage<String>();
    t5.add("a");
    t5.add("b");
    t5.add("c");
    if (!t5.addAll(t5))
         System.out.println("You can not add yourself to yourself.");
    b5.add("c");
    b5.add("d");
    System.out.println("Storage t5:");
    t5.print();
    System.out.println("Storage b5:");
    b5.print();
    t5.addAll(b5);
    System.out.println("After addAll method");
    t5.print();
    return t5.addAll(b5)?true:false;
  }

  /**
    * This method tests the remove() storage method.
    *     
    * @param    -             -
    *   
    * @return   true/false    Method returns false if the test fails else
    *                         it returns true.   
    */
  public static boolean testRemove(){
    System.out.println("\ntestRemove method");
    Storage<String> t1 = new Storage<String>();
    t1.add("a");
    t1.add("b");
    t1.add("c");
    System.out.println("Storage t1:");
    t1.print();
    t1.remove("a");
    System.out.println("After removing a:");
    t1.print();
    return t1.remove("a")?true:false;
  }

  /**
    * This method tests the removeAll() storage method.
    *     
    * @param    -             -
    *   
    * @return   true/false    Method returns false if the test fails else
    *                         it returns true.   
    */
  public static boolean testRemoveAll(){
    System.out.println("\ntestRemoveAll method");
    Storage<String> t2 = new Storage<String>();
    Storage<String> b2 = new Storage<String>();
    t2.add("a");
    t2.add("b");
    t2.add("c");
    t2.add("d");
    b2.add("a");
    b2.add("b");
    System.out.println("Storage t2");
    t2.print();
    System.out.println("Storage b2");
    b2.print();
    t2.removeAll(b2);
    System.out.println("Removing Storage b2 from t2:");
    t2.print();
    return t2.removeAll(b2)?true:false;
  }

  /**
    * This method tests the contains storage method.
    *     
    * @param    -             -
    *   
    * @return   true/false    Method returns false if the test fails else
    *                         it returns true.   
    */
  public static boolean testContains(){
    System.out.println("\ntestContains method");
    Storage<String> t3 = new Storage<String>();
    t3.add("a");
    t3.add("b");
    t3.add("c");
    t3.add("d");
    System.out.println("Storage t3:");
    t3.print();
    System.out.println("Check if Storage t3 contains b");
    System.out.println(t3.contains("b"));
    System.out.println("Check if Storage t3 contains f");  
    System.out.println(t3.contains("f"));
    return t3.contains("b")?true:false;
  }

  /**
    * This method tests the clear() storage method.
    *     
    * @param    -             -
    *   
    * @return   true/false    Method returns false if the test fails else
    *                         it returns true.   
    */
  public static boolean testClear(){
    System.out.println("\ntestClear method");
    Storage<String> t6 = new Storage<String>();
    t6.add("a");
    t6.add("b");
    t6.add("c");
    t6.add("d");
    System.out.println("Storage t6 before clear method:");
    t6.print();
    t6.clear();
    System.out.println("Size of t6 after clear method:");
    System.out.println(t6.size());
    return t6.size()==0?true:false;
  }

  /**
    * This method contains all thes testcases for the implemented storage
    * method.
    *     
    * @param    Storage<string>     Storage on which various methods are to be
    *                               performed.    
    *   
    * @return   void                This method does not return any type.
    *                      
    */
  public static void test(Storage<String> aStorage)   {
                if ( ! testRemove() )
                        System.err.println("testRemove failed");
                if ( ! testRemoveAll() )
                        System.err.println("testRemove failed");
                if ( ! testContains() )
                        System.err.println("testContains failed");
                if ( ! testAdd() )
                        System.err.println("testAdd failed");
                if ( ! testAddAll() )
                        System.err.println("testAddAll failed");
                if ( ! testClear() )
                        System.err.println("testClear failed");
  }

  /**
    * The main program.
    *
    * @param    args    command line arguments (ignored)
    */
  public static void main(String args[] ){
      exampleOfHowToUseIt(new Storage<String>());
    }
}