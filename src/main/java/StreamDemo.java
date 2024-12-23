import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		//Stream<Integer> stream =  numbers.stream();
		
		System.out.println(numbers.stream().filter(x -> x % 2 ==0).count());
		
		
		//Creating stream.
		//1. from collection
		List<Integer> list = Arrays.asList(1,2,3,4,56,89);
		Stream<Integer> stream = list.stream();
		// 2. from arrays
		String[] array = {"a", "b", "c", "d"};
		Stream<String> stream2 = Arrays.stream(array);
		
		//3. Using stream.of()
		Stream<String> stream3 = Stream.of("a", "b","c");
		//.4 Infinite Streams
		Stream<Integer> generate = Stream.generate(() -> 1);
		List<Integer>  collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
		System.out.println(collect);
		
	}
}