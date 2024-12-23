package EngineeringDigest_CollectionsFrameWork;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_Concept {
	
	public static void main(String[] args) {
//		Node node1= new Node();
//		Node node2 = new Node();
//		
//		node1.value = 1;            this is how linkedlist works internally.
//		node2.value = 2;
//		node1.next = node2;
//		node2.next = null;
		
		
		LinkedList<Integer> link = new LinkedList<>();
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4); // here time complexity will be O(n).
		link.add(0);
		link.addLast(8);  // O(n)
		link.addFirst(0);  // O(n).
		link.getFirst();
		link.getLast();
		System.out.println(link);
		link.removeIf(x -> x % 2 == 0);
		System.out.println(link);
		
		
		LinkedList<String> colors = new LinkedList<>(Arrays.asList("red" , "green", "violet"));
		LinkedList<String> colorsToRemove = new LinkedList<>(Arrays.asList("red", "grey"));
		System.out.println(colors);
		colors.removeAll(colorsToRemove);
		System.out.println(colors);
		
	}
}

class Node
{
	public int value;
	public Node next;	
}
