package mock2stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfEachElement {
	
	public static void main(String[] args) {
		
		int arr [] = {5,5,5,7,2,4,9,6,6};
		Map<Integer, Integer> tm = new TreeMap<>();
		int x =0;
		for(int i=0; i<arr.length; i++)
		{
			if(!tm.containsKey(arr[i]))
			{
				tm.put(arr[i], 1);
			}
			else 
			{
				x = tm.get(arr[i]);
				x++;
				tm.put(arr[i], x);
			}
		}
		System.out.println(tm);
	}

}
