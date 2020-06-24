package com.implementation.stack;

/**
 * 
 * @author vaibhav
 *
 *  Stack implementation using an array as the underlying DS
 */
public class Stack {

  static final int MAX_SIZE = 5;
  int[] stackArr = new int[MAX_SIZE];
  int top = -1;

  /**
   * 
   * @param num - takes in the item to be inserted into the stack
   */
  public void push(int num) {
    if (!isFull()) {
      stackArr[++top] = num;
      System.out.println(num+" pushed successfully");
    } else {
      System.out.println("Stack is full");
    }
  }

  /**
   * returns true if the stack is full
   * @return 
   */
  private boolean isFull() {
    return (top == MAX_SIZE - 1);
  }

  /**
   * removes the item at the top of the stack and returns it
   * @return  
   */
  public int pop() {
    int item = -1;
    if (!isEmpty()) {
      item = stackArr[top];
      top--;
    }
    return item;
  }

  /**
   * returns the item at the top without removing it from the stack.
   * @return
   */
  public int peek() {
    return stackArr[top];
  }

  /**
   * returns the number of elements in the stack.
   * @return
   */
  public int size() {
    return top + 1;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  /**
   * Runner for the program
   * @param args
   */
  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);
    int item = s.pop();
    if(item!=-1)
      System.out.println("popped "+item);
    else
      System.out.println("Stack empty");
    
    System.out.println("Stack size = "+s.size());
  }

}
