package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluation {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alice", "brat", "Tom", "Toby");
		
		Stream<String> filteredNames = names.stream()
				.filter(c -> { 
			System.out.println("Filtering : " + c );
			return c.length() > 3;
		});
		
		System.out.println("Before terminal operation");
		
		List<String> result = filteredNames.collect(Collectors.toList());
		
		System.out.println("After terminal operation");
		System.out.println(result);
		
	}
}