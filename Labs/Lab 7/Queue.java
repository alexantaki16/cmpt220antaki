/*
 * file: Queue.java
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 18, 2017
 * version: 1
 *
 *  This program will take the numbers 1 through 20 and put them into a queue.
 */
public class Queue{

  //Initilize all data fields
  private int[] elements = new int[8];
  private int size;
  public static final int DEFAULT_CAPACITY = 8;

  //Create a defualt constructor
  public Queue(){
    this (DEFAULT_CAPACITY);
  }

  //Create a second constructor
  public Queue(int capacity){
    elements = new int[DEFAULT_CAPACITY];
  }

  /*
   * enqueue
   *
   * This method will place all of the values into the queue.
   *
   * Parameters:
   *   int v: This value holds the numbers 1-20.
   *
   * Return value: This method is void and does not return anything
  */
  public void enqueue(int v){
    if(size >= elements.length){
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }
    elements[size++] = v;
  }

  /*
   * dequeue
   *
   * This method will take the values in the queue and return them in the proper
   * order.
   *
   * Parameters:
   *   There are none
   *
   * Return value: This method returns the value in the 0 index.
  */
  public int dequeue(){
    int zeroIndex = elements[0];
    for(int i = 1; i < elements.length; i++){
      elements[i - 1] = elements[i];
    }
    size--;
    return zeroIndex;
  }

  /*
   * empty
   *
   * This method will check whether the queue is emtpy or not.
   *
   * Parameters:
   *   There are none
   *
   * Return value: This method returns the size when it equals 0.
  */
  public boolean empty(){
    return size == 0;
  }

  /*
   * getSize
   *
   * This method will take in the size
   *
   * Parameters:
   *   There are none
   *
   * Return value: This method returns the size
  */
  int getSize(){
    return size;
  }
}
