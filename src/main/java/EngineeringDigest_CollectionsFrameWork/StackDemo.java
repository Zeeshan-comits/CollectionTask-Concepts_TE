package EngineeringDigest_CollectionsFrameWork;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		System.out.println(stack);
		//stack.pop();
		Integer peekValue = stack.peek();
//		System.out.println(peekValue);
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.size());
		
		int search =  stack.search(5); // why is the search method not returning the index position of element. 
		System.out.println(search);
		
		
		
		//we can alos use linkedlist as stack
		
		LinkedList<Integer> link = new LinkedList<>();
		link.addLast(1); // using addLast method elements are added on the top of stack.
		link.addLast(90);
		link.addLast(56);
		link.addLast(98);
		link.addLast(199);
		
		
		link.getLast(); // this will work as peek method.
		link.removeLast(); // this is equivq;ent to pop method
		
		//System.out.println(link);
	}
}
