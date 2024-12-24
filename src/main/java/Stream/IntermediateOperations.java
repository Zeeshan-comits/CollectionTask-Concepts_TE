package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {
		//intermediate operation  transform a stream into another stream.
		// They are lazy means they dont execute until a terminal operation is invoked.
		
		
		
		//1. filter
		
		List<String> list = Arrays.asList("joy", "toy", "boy", "roy");
		Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("r"));
		//no filtering at this point.
		
		long res =  list.stream().filter(x -> x.startsWith("r")).count(); // using terminal operation here.
		System.out.println(res);
		
		
		
		// 2.map
		Stream<String> stringStream = list.stream().map(String::toUpperCase); 
		
		//3 sorted stream
		Stream<String> sortedStream = list.stream().sorted(); // stream will be sorted in natural order.
		
		//4. distinct
		System.out.println(list.stream().filter(x -> x.startsWith("t")).distinct().count());
		
		
		//limit
		System.out.println(Stream.iterate(1, x -> x +1).limit(101).count());
		
		//skip
		System.out.println(Stream.iterate(2, u -> u+2).skip(15).limit(210).count());
		
	}
}
