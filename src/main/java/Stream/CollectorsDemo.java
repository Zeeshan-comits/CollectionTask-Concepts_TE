package Stream;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		
//		List<Character> list = Arrays.asList('a','r','a','g','h','h');
//		Set<Character> set = list.stream().collect(Collectors.toSet());
//		System.out.println(set);
		
		List<String> list = Arrays.asList("aaa","rrr","add","gfg","hh","hh");
		Set<String> set = list.stream().collect(Collectors.toSet());
		System.out.println(set);
		
		//collecting to a specific collection.
		ArrayDeque<String> collect = list.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
		
		//joining  Strings
		//String concatenatedNames = list.stream().map(String::toUpperCase).collect(Collectors.joining());
		String concatenatedNames = list.stream().map(String::toUpperCase).collect(Collectors.joining("--"));

		System.out.println(concatenatedNames);
		
		
		//Calculating average
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
		Double avg =  nums.stream().collect(Collectors.averagingInt(x -> x));
		System.out.println("Average " + avg);
		
		
		//partitioning elements.
		System.out.println(list.stream().collect(Collectors.partitioningBy(x -> x.length()> 2)));
		
		//Mapping and collecting
		//applies a mapping function before collecting.
		System.out.println(list.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));
			
		//Counting Word Occurences.
		String sentence = "Hello World Hello java World";
		System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));
		
		// partitioning by even and odd number.
		List<Integer> list1 = Arrays.asList(34,67,8775,67,809);
		System.out.println(list1.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));
		
	}
}
