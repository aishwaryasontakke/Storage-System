/*
 * StorageI.java 
 * 
 * Version: 
 *       1 
 * 
 * Revisions: 
 *       2
 */

/**
 * This file describes the interface for the Storage.
 *
 * @author      Soniya Rode
 * @author      Aishwarya Sontakke
 */
public interface StorageI<E>  {

	public abstract boolean add(E e);	
	public E get();		
	public void clear();		
	public boolean contains(E e);
	public boolean isEmpty();
	public void sort();		
	public int size();		
	public String getClassName();
}