package Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TerminalOps {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3);
		// 1. collect
		
		list.stream().skip(1).collect(Collectors.toList()); // collectors is a terminal operation.
		// list.stream().skip(1).toList(); // toList is also a termination operation.
		
		//2. forEach              
		list.stream().forEach(k -> System.out.println(k));
		
		// 3. reduce : combines  element to produce a single result.
		 Optional<Integer> optionalInteger = list.stream().reduce((g,h) -> g + h);
		 System.out.println(optionalInteger.get());
		 
		 
		 //4. Count
		 
		 
		 //5. AnyMatch AllMatch  noneMatch
		 boolean b = list.stream().anyMatch(c -> c % 2 == 0);
		 System.out.println(b);
		 boolean bol = list.stream().allMatch(j -> j %2 == 0);
		 System.out.println(bol);
		 
		 
		 boolean bool = list.stream().noneMatch(p -> p >100);
		 System.out.println(bool);
		 
		 //findFirst, findAny.
		 System.out.println(list.stream().findFirst().get());
		 System.out.println(list.stream().findAny().get());
		 
		 //Example filtering and collecting names
		 List<String> names = Arrays.asList("rohit", "kol", "radio");
		 System.out.println(names.stream().filter(x -> x.length() > 3).collect(Collectors.toList()));
		 
		 
		 //Example: Squaring and sorting numbers.
		 List<Integer> num = Arrays.asList(56,3,2,5,67,97,21);
		 System.out.println(num.stream().map(x -> x*x).sorted().collect(Collectors.toList()));
		 
		 
		 // Summing Values.	
		 List<Integer> sum = Arrays.asList(45,64,83,67,9012);
		 System.out.println(sum.stream().reduce(Integer:: sum).get());
		 
		 //Counting Occurence of a character.
		 String sentence = "asus Laptop";
		 System.out.println(sentence.chars().filter(v -> v =='p').count());
		 
		 // stateful and stateless operation.
		 
		 
		 //flatmap
		 List<String> sentences = Arrays.asList(
				 "Hello world",
				 "flatmap is useful",
				 "green pen"
				 );
		 
		 System.out.println(((Stream<String>) sentences
				 .stream().flatMap(sentencee ->
				 Arrays.stream(sentencee.split(" ")))
				 .map(String::toUpperCase)).collect(Collectors.toList()));
	}
}