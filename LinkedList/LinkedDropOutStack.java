

/**
 * Represents a linked implementation of a stack.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class LinkedDropOutStack<T> extends LinkedStack<T>
{
    private int length;

    /**
     * Creates an empty stack.
     */
    public LinkedDropOutStack()
    {
        count = 0;
        top = null;
        length = 5;
    }
    
    /**
     * Creates a stack whose maximum size will be 
     * equals to the variable passed in function.
     */
    public LinkedDropOutStack(int size_of_stack)
    {
        count = 0;
        top = null;
        length  = size_of_stack;
    }

    /**
     * Adds the specified element to the top of this stack.
     * If size is n and we going to push (n+1) element it will
     * delete the last node of the list and add the (n+1)th element 
     * to the front of the list.
     * @param element element to be pushed on stack
     */
    public void push(T element)
    {
    	LinearNode current = top;
    	
    	if(count == length)
    	{
    		while(current.getNext().getNext() != null)
        	{
        		current = current.getNext();
        	}
        	current.setNext(null);
    	}
       	
        LinearNode<T> temp = new LinearNode<T>(element);
        temp.setNext(top);
        top = temp;
        if(count != length)
        {
        	count++;
        }
         
    }

}
