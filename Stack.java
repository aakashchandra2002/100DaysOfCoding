package dsa_problems;

public class Stack 
{
	    static final int MAX = 10;
	    int top;
	    int[] a = new int[MAX]; // Maximum size of Stack

	    Stack()
	    {
	        top = -1;
	    }

	    boolean push(int x)
	    {
	        if (top >= (MAX - 1)) 
	        {
	            System.out.println("Stack Overflow");
	            return false;
	        }
	        else 
	        {
	            a[++top] = x;
	            System.out.println(x + " pushed into stack");
	            return true;
	        }
	    }

	    int pop()
	    {
	        if (top < 0) 
	        {
	            System.out.println("Stack Underflow");
	            return Integer.MIN_VALUE;
	        }
	        else 
	        {
	            int x = a[top--];
	            return x;
	        }
	    }

	    int peek()
	    {
	        if (top < 0) 
	        {
	            System.out.println("Stack Underflow");
	            return 0;
	        }
	        else 
	        {
	            int x = a[top];
	            return x;
	        }
	    }
	    int size() 
	    {
	        return (top + 1);
	    }

	    boolean isEmpty() 
	    {
	        return top == -1;
	    }

	    boolean isFull() 
	    {
	        return top == MAX - 1;
	    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.size());
        System.out.println(s.peek() + " is top element");
        String result;
        System.out.println(result = (s.isEmpty()) ? "Stack is Empty" : "Stack is not Empty");
        System.out.println(result = (s.isFull()) ? "Stack is Full" : "Stack is not Full");

    }
}