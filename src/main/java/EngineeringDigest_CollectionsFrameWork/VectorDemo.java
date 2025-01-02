package EngineeringDigest_CollectionsFrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector(4, 2); // if we give the capacity increment then the increment value will be added to the original capacity.
		vector.add(1);
		vector.add(1); // if we add elements more than the capacity vector will double its size.
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(3, 20);
		
		Iterator<Integer> iterator = vector.iterator();
		if(iterator.hasNext())
		{
			for(int x: vector)
			{
				System.out.println(x);
			}
		}
		
		
		
		//System.out.println(vector.capacity());
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		
		Vector<Integer> vector2 = new Vector(linkedList);
		//System.out.println(vector2);
		
		Vector<Integer> vector3 = new Vector<>();
		System.out.println(vector3);
		
		Iterable
	}

}
