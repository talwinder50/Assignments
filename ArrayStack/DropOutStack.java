

/**
 * An array implementation of a stack in which the bottom of the
 * stack is fixed at index 0.
 *
 * @author Java Foundations
 * @version 4.0
 */
public class DropOutStack<T> extends ArrayStack<T>
{
    private int counter;

    /**
     * Creates an empty stack using the default capacity.
     */
    public DropOutStack()
    {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates an empty stack using the specified capacity.
     * @param initialCapacity the initial size of the array
     */
    public DropOutStack(int initialCapacity)
    {
        top = 0;
        counter = 0;
        stack = (T[])(new Object[initialCapacity]);
    }

    /**
     * Adds the specified element to the top of this stack, expanding
     * the capacity of the array if necessary.
     * @param element generic element to be pushed onto stack
     */
    public void push(T element)
    {
    	stack[top % stack.length] = element;
        top++;
        counter++;
    }

    /**
     * Removes the element at the top of this stack and returns a
     * reference to it.
     * @return element removed from top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    public T pop() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

        T result ;
        
        if(top == 0 && !isEmpty())
        {
        	top = stack.length - 1;
        }
        else{
        		top--;
        	top=top % stack.length;
        }
        	result = stack[top];
            stack[top] = null;
        return result;
    }

    /**
     * Returns a reference to the element at the top of this stack.
     * The element is not removed from the stack.
     * @return element on top of stack
     * @throws EmptyCollectionException if stack is empty
     */
    public T peek() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("stack");

		if(top == 0 && !isEmpty())
		{
			return stack[stack.length-1];
		}
		else{
			top=top % stack.length;
        return stack[top-1];
		}
        
    }

    /**
     * Returns true if this stack is empty and false otherwise.
     * @return true if this stack is empty
     */
    public boolean isEmpty()
    {
    	if( counter == 0)
    		return true;
    	else
    		return false;
    }

    /**
     * Returns the number of elements in this stack.
     * @return the number of elements in the stack
     */
    public int size()
    {
    	return counter;
    }

    /**
     * Returns a string representation of this stack.
     * @return a string representation of the stack
     */
    public String toString()
    {
        String result ="";
         for( int i = 0; i <stack.length; i++)
        {
        	result +=  stack[i] + " ";
        }
          return result;
    }
}

