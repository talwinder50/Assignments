import java.util.Iterator;

public class tester {

	public static void main(String args[])
	{

		System.out.print("Array Binary Tree Implementation: \n");
		
		ArrayBinaryTree<Integer> tree1 = new ArrayBinaryTree<Integer>(8);
		ArrayBinaryTree<Integer> tree2 = new ArrayBinaryTree<Integer>(9);
		ArrayBinaryTree<Integer> tree3 = new ArrayBinaryTree<Integer>(4,tree1,tree2);
		
		tree1 = new ArrayBinaryTree<Integer>(10);
		tree2 = new ArrayBinaryTree<Integer>(11);
		ArrayBinaryTree<Integer> tree4 = new ArrayBinaryTree<Integer>(5,tree1,tree2);
		ArrayBinaryTree<Integer> tree5 = new ArrayBinaryTree<Integer>(2,tree3,tree4);
		
		tree1 = new ArrayBinaryTree<Integer>(12);
		tree2 = new ArrayBinaryTree<Integer>(13);
		tree3 = new ArrayBinaryTree<Integer>(6,tree1,tree2);
		
		tree1 = new ArrayBinaryTree<Integer>(14);
		tree2 = new ArrayBinaryTree<Integer>(15);
		tree4 = new ArrayBinaryTree<Integer>(7,tree1,tree2);
		ArrayBinaryTree<Integer> tree6 = new ArrayBinaryTree<Integer>(3,tree3,tree4);
		ArrayBinaryTree<Integer> tree7 = new ArrayBinaryTree<Integer>(1,tree5,tree6);
		
		/*
		 *  getRootElement() Testing
		 */
		 System.out.print("The root Element is : " +tree7.getRootElement() + "\n");
		 
		 /*
		  * isEmpty tester
		  */
		System.out.print("\n" + "isEmpty?  " +tree7.isEmpty() + "\n");
		
		/*
		 * size testing
		 */
		 System.out.print("\n" + "Size is : " +tree7.size() + "\n");
		 
		 /*
		  * contains
		  */
		  System.out.print("\n" +"Is it contain '7' : " + tree7.contains(7) + "\n");
		  
		  /*
		   * find
		   */
		 System.out.print("\n" +"Find element '10': " +tree7.find(10) + "\n");
		 
		 /*
		  * toString
		  */
		System.out.println("\n" + "toString representation of tree is " + "\n" +  tree7.toString() + "\n");
		
   		/*
   		 * Iterator functions testing.
   		 */
 		System.out.println("Representation of In-oder tree:");
		Iterator obj = tree7.iteratorInOrder();
		while(obj.hasNext()){
		System.out.print(obj.next() + " ");
		}
		
		System.out.println("\n" +  "Representation of Level-oder tree:");
		obj = tree7.iteratorLevelOrder();
		while(obj.hasNext()){
		System.out.print(obj.next() + " ");
		}
		
		System.out.println("\n" +  "Representation of Pre-oder tree:");
		obj = tree7.iteratorPreOrder();
		while(obj.hasNext()){
		System.out.print(obj.next() + " ");
		}
		
		System.out.println("\n" +  "Representation of Post-oder tree:");
		obj = tree7.iteratorPostOrder();
		while(obj.hasNext()){
		System.out.print(obj.next() + " ");
		}
	}
}
