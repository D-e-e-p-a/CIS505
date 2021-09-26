package Module_4;

import java.util.LinkedList;

public class GenericQueue<E> {
	
	 private LinkedList<E> list=new LinkedList<>(); //private generic list
	 
	 public void enque(E item) { //Adds item first to the list
		 list.addFirst(item);
	 }
	
	 public E dequeue() {//Removes the first item 
		return  list.removeFirst();
		 
	 }
	 public int size() { //returns he size of the list
		 return list.size();
	 }
	

}
