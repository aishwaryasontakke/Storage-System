/* 
 * FastSort.java 
 * 
 * Version: 
 *       2 
 * 
 * Revisions: 
 *       1
 */

/**
 * This FastSort class has various methods which are used
 * to test the storage system methods in Storage.java
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */
public class FastSort {

  /**
    * This method shows the execution of all the storage system methods.
    *     
    * @param    Storage<string>     Storage on which various methods are to be
    *                               performed.    
    * @return   void                This method does not return any type.   
    */
  public static void exampleOfHowToUseIt( Storage<String> aStorage){
        aStorage = new Storage<String>();
        Storage<String> bStorage = new Storage<String>();
        String[] sets={"a","c","f","d","a","g"};
        System.out.println("aStorage:");
        for(int i=0;i<sets.length;i++){
            System.out.print(sets[i]+" ");
        }
        for(int i=0;i<sets.length;i++){
            aStorage.add(sets[i]);
        }
        System.out.println("\nSize of aStorage :"+aStorage.size());
        System.out.println("After Sorting :");
        aStorage.sort();
        System.out.println("");
         
        testContains();
        testAdd();
        testClear();
        testIsEmpty();

        System.out.println("\ngetClassName method");
        System.out.println("Class of aStorage: " + aStorage.getClassName());

        //Creating a new Storage object of type integer
        Storage<Integer> iStorage = new Storage<Integer>();
        System.out.println("iStorage:");
        iStorage.add(1);
        iStorage.get();
        System.out.println("\nClass of iStorage: " +iStorage.getClassName());
  }

  /**
    * This method tests the contains storage method.
    *     
    * @param    -          -
    *   
    * @return   boolean    Method returns false if the test fails else
    *                      it returns true.   
    */
  public static boolean testContains(){
    System.out.println("\ntestContains method");
    Storage<String> t1 = new Storage<String>();
    t1.add("a");
    t1.add("b");
    t1.add("c");
    t1.add("d");
    System.out.println("Storage t1:");
    t1.get();
    System.out.println("Check if Storage t1 contains b");
    System.out.println(t1.contains("b"));
    System.out.println("Check if Storage t1 contains f");  
    System.out.println(t1.contains("f"));
    return t1.contains("b")?true:false;
  }

    /**
      * This method tests the add() storage method.
      *     
      * @param    -          -
      *   
      * @return   boolean    Method returns false if the test fails else
      *                      it returns true.   
      */
    public static boolean testAdd(){
    System.out.println("\ntestAdd method");
    Storage<String> t2 = new Storage<String>();
    System.out.println("Storage t2");
    t2.add("m");
    System.out.println("Adding m to Storage t2:");
    t2.get();
    return t2.add("a")?true:false;    
  } 

  /**
    * This method tests the clear() storage method.
    *     
    * @param    -          -
    *   
    * @return   boolean    Method returns false if the test fails else
    *                      it returns true.   
    */
  public static boolean testClear(){
    System.out.println("\n\ntestClear method");
    Storage<String> t3 = new Storage<String>();
    t3.add("a");
    t3.add("b");
    t3.add("c");
    t3.add("d");
    System.out.println("Storage t3 before clear method:");
    t3.get();
    System.out.println();
    t3.clear();
    System.out.println("Size of t3 after clear method:");
    System.out.println(t3.size());
    return t3.size()==0?true:false;
  }

  /**
    * This method tests the isEmpty() storage method.
    *     
    * @param    -          -
    *   
    * @return   boolean    Method returns false if the test fails else
    *                      it returns true.   
    */
  public static boolean testIsEmpty(){
    System.out.println("\ntestIsEmpty method");
    Storage<String> t4 = new Storage<String>();
    t4.add("a");
    t4.add("b");
    t4.add("c");
    t4.add("d");
    System.out.println("Storage t4 before clear method:");
    t4.get();
    System.out.println("\nIs storage t4 empty?");
    System.out.println(t4.isEmpty());
    System.out.println("After using clear method on t4");
    t4.clear();
    System.out.println("Is storage t4 empty?");
    System.out.println(t4.isEmpty());
    return t4.isEmpty()?true:false;
  }

  /**
    * This method contains the testcases for the implemented storage
    * methods.
    *     
    * @param    Storage<string>     Storage on which various methods are to be
    *                               performed.    
    *   
    * @return   void                This method does not return any type.
    *                      
    */
  public static void test(Storage<String> aStorage)   {
                if ( ! testContains() )
                        System.err.println("testContains failed");
                if ( ! testAdd() )
                        System.err.println("testAdd failed");
                if ( ! testClear() )
                        System.err.println("testClear failed");
                if ( ! testIsEmpty() )
                        System.err.println("testIsEmpty failed");
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