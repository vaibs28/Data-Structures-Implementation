package com.implementation.queue;

/**
 * 
 * @author vaibhav
 * Queue FIFO implementation using an array
 */
public class Queue {

  static final int SIZE = 3;
  int[] q = new int[SIZE];
  int front = -1, rear = -1;
  
  /**
   * insert an item from the front of the queue
   * @param item
   */
  public void enqueue(int item) {
    if(!isFull()) {
      rear++;
      q[rear] = item;
    }else {
      System.out.println("Queue is full");
    }
  }
  
  /**
   * removes the item from the front of the queue
   * @return
   */
  public int dequeue() {
    if(!isEmpty())
      return q[++front];
    return -1;
  }
  
  /**
   * returns the number of items in the queue
   * @return
   */
  public int size() {
    return rear-front;
  }
  
  /**
   * 
   * @return
   */
  public boolean isEmpty() {
    return front==rear;
  }
  
  /**
   * 
   * @return
   */
  public boolean isFull() {
    return rear == SIZE-1;
  }
  
  public int peek() {
    return q[front+1];
  }
  
  public static void main(String[] args) {
    Queue q = new Queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    int item = q.dequeue();
    System.out.println("Dequeued "+item);
    System.out.println("Dequeued "+q.dequeue());
    System.out.println("Size= "+q.size());
    System.out.println("Front item= " +q.peek());
    System.out.println("Dequeued "+q.dequeue());
    System.out.println("Dequeued "+q.dequeue());
    System.out.println("size = "+q.size());
  }
}
