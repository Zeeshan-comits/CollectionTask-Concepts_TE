package EngineeringDigest_CollectionsFrameWork;

import java.util.ArrayList;
import java.util.Vector;

public class VectorThreadDemonstration {
	
	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector();
		Thread t1 = new Thread(() -> {
			for(int i=0; i< 1000; i++)
			{
				list.add(i);
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int j =0; j<100; j++)
			{
				list.add(j);
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(list.size());
	}
}
