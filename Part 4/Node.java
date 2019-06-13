/* 
 * Node.java 
 * 
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       1
 */

/**
 * This class is the structure of the binary tree.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */

class Node<F> {
    F value;
    Node left;
    Node right;
    static int counter=0;

    //Constructor of node class
    Node(F value) {
        this.value = value;
        right = null;
        left = null;
        counter++;
    }
}