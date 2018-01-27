

public class ArrayStackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack<Integer> mystack = new ArrayStack<Integer>(6);

		// pushing numbers into stack
		mystack.push(1);
		mystack.push(2);
		mystack.push(7);
		mystack.push(9);
		mystack.push(15);
		mystack.push(100);

		System.out.println("List of elements in a stack after push : ");
		System.out.print(mystack.toString() + "\n");

		//printing size and the peek element
		System.out.println("\n"+ "Size of stack is : ");
		System.out.print(mystack.size() + "\n");
		System.out.println("\n"+ "Peek element on stack is : ");
		System.out.print(mystack.peek() + "\n");


		//poping out elements and printing the list
		mystack.pop();
		System.out.println("\n" + "List of elements after a pop on a stack : ");
		System.out.print(mystack.toString() + "\n");

		//printing size and peek element after pop on stack
		System.out.println("\n" + "Remaining Size of stack is : ");
		System.out.print(mystack.size() + "\n");
		System.out.println("\n"+ "New Peek element on stack is : ");
		System.out.print(mystack.peek() + "\n");
		System.out.println("************************************************");
		DropOutStack<Integer> mystack1 = new DropOutStack<Integer>(5);

		// pushing numbers into stack
		mystack1.push(4);
		mystack1.push(3);
		mystack1.push(5);
		mystack1.push(0);
		mystack1.push(10);
        mystack1.push(9);
        
		//mystack1.push(3);
        

		System.out.println("List of elements in a Different Drop Out stack after push :");
		System.out.print(mystack1.toString() + "\n");
		System.out.println("\n" + " Size of Drop out stack is : " +mystack1.size() +"\n" );
        System.out.print(" Lets check peek element is :" +   mystack1.peek() + "\n");

		//mystack1.pop();
		mystack1.pop();
		System.out.println("\n"+ "Popping the element in Drop out stack is : ");
		System.out.print(mystack1.toString() + "\n");
     	System.out.println("\n"+ "New Peek element on Drop out stack is : ");
		System.out.print("Peek element is :" +   mystack1.peek() + "\n");
		mystack1.pop();
		System.out.print("Updated Stack , Note pop removes the peek element : "+ mystack1.toString() + "\n");

	}

}
