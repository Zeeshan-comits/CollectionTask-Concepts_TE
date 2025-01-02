package EngineeringDigest_CollectionsFrameWork;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<>(17, 0.05f); // inside the hashmap constructor we can give our own initial capacity and load factor as well.
		hashmap.put(1, "Akshit");
		hashmap.put(2, "Rakshit");
		hashmap.put(3, "Neha");
		hashmap.put(4, "subham"); 
		System.out.println(hashmap);
		
		System.out.println(hashmap.get(3));
		System.out.println(hashmap.get(30));
		
		System.out.println(hashmap.containsKey(2));
		System.out.println(hashmap.containsValue("Rakshit"));
		
		for(int i: hashmap.keySet())
		{
			System.out.println(hashmap.get(i));
		}
		
		Set<Map.Entry<Integer, String>> entries = hashmap.entrySet();
		
		for(Map.Entry<Integer, String> entry : entries)
		{
			//System.out.println(entry.getKey() + " " + entry.getValue());
			entry.setValue(entry.getValue().toUpperCase());
		}	
		System.out.println(hashmap);
		
		hashmap.remove(4);
		System.out.println(hashmap);
	}
}