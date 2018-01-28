
public class LinearNodeTester {

	/**
	 * Method main
	 *
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {

		LinkedStack<Integer> linked_stack = new LinkedStack<Integer>();

		linked_stack.push(5);
		linked_stack.push(2);
		linked_stack.push(9);
		linked_stack.push(1);
		linked_stack.push(8);
		linked_stack.push(10);

		System.out.print( "List of elements after push : " + linked_stack.toString() + "\n" );
		System.out.print( "Size of list is : " + linked_stack.size() + "\n");
		System.out.print( "Peek element of the list is : " + linked_stack.peek() + "\n");
		
		linked_stack.pop();
		
		System.out.print( "List of elements after pop : " + linked_stack.toString() + "\n" );
		System.out.print( "Size is : " + linked_stack.size() + "\n");
		System.out.print( "Peek element is : " + linked_stack.peek() + "\n");
		
			System.out.print("\n" +  " ***************** Linked Drop Out Stack Testing ********************" + "\n");
		
		/***********  LinkedDropOutStack testing *****************/
		 
		LinkedDropOutStack<Integer> linked_drop_stack = new LinkedDropOutStack<Integer>(5);
		
		linked_drop_stack.push(5);
		linked_drop_stack.push(2);
		linked_drop_stack.push(9);
		linked_drop_stack.push(1);
		linked_drop_stack.push(10);
		linked_drop_stack.push(7);
		linked_drop_stack.push(19);
		
		System.out.print("\n"+ "List of elements in Linked-Drop-Out stack : " + linked_drop_stack.toString() + "\n" );
		
		linked_drop_stack.push(11);
		System.out.print("\n" + "List after pushing '11' is : " + linked_drop_stack.toString() + "\n" );
		
		linked_drop_stack.push(13);
		System.out.print( "\n" +"List after pushing '13' is : " + linked_drop_stack.toString() + "\n" );
		
		System.out.print( "\n" +"Size of Linked-Drop-Out stack is : " + linked_drop_stack.size() + "\n");
		System.out.print( "\n" +"Peek element of Linked-Drop-Out stack is : " + linked_drop_stack.peek() + "\n");
		
		linked_drop_stack.pop();
		System.out.print("\n" + "List of elements after pop : " + linked_drop_stack.toString() + "\n" );
		
		
	}
}
