package mock2stream;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWordsInSentence {
	
	public static void main(String[] args) {
		String sentence = "hi hi hello hello trophy silver james trophy";
		
		//using stream.
		//Map<String, Integer> wordFrequency = sentence.stream(
		String [] str = sentence.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(String word : str)
		{
			if(hm.containsKey(word))
			{
				hm.put(word, hm.get(word) + 1);
			}
			else
			{
				hm.put(word, 1);
			}
		}
		
		for(Map.Entry<String, Integer>  e:hm.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}