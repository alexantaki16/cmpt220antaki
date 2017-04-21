/*
 * file: Question10_10.java
 * author: Alex Antaki
 * course: CMPT 220
 * assignment: Lab 7
 * due date: April 18, 2017
 * version: 1
 *
 *  This program will take the numbers 1 through 20 and put them into a queue.
 */
public class Question10_10 extends Queue{
  public static void main(String[] args){

    //Create an instance of the object
    Queue myQueue = new Queue();

    //Input the numbers into the queue by calling enqueue
    for(int i = 1; i <= 20; i++){
      myQueue.enqueue(i);
    }

    //Use a while loop to repeatedly display the queue until it is empty
    while(!myQueue.empty())
      System.out.print(myQueue.dequeue() + " ");
      System.out.println();
  }
}
