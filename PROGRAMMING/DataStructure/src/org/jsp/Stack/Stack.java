package org.jsp.Stack;
public class Stack 
{
  private Object [] arr;
  private int top=-1;
  
  Stack ()
  {
	  arr= new Object [10];
  }
  
  public boolean isEmpty()
  {
	  return top==-1;
  }
  public boolean isFull()
  {
	  return top==arr.length-1;
  }
  public Object Peak()
  {
	  if(isEmpty())
	  {
		  try {
			throw new StackException("Stack is Under flow error "+""+top+" "+"NO element is present");
		} catch (StackException e) {
			e.printStackTrace();
		}
	  }
	  return arr[top];
  }
  
  public void push(Object ob)
  {
	  if(isFull())
	  {
		  try {
				throw new StackException("Stack is Over flow error "+" "+top+1);
			} catch (StackException e) {
				e.printStackTrace();
			}
	  } 
	  arr[++top]=ob;
  }
  public Object Pop()
  {
	  if(isEmpty())
	  {
		  try {
				throw new StackException("Stack is Under flow error "+" "+top+" "+"Your stack is Empty");
						
			} catch (StackException e) {
				e.printStackTrace();
			}
	  } 
	  
	  return arr[top--];  
  }
  public int size()
  {
	  return top+1;
  }
	
}
