package CollectionProgrammes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Demo {
	
	public static void main(String[] args) {
		
		//PREDICATE
		
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		System.out.println(isEven.test(10));
		
		Predicate <String> isWordEndsWith = h -> h.toLowerCase().endsWith("h");
		
		Predicate <String> isWordStartsWith = y -> y.toLowerCase().startsWith("z");
		
		Predicate<String> predicateJoin = isWordStartsWith.and(isWordEndsWith);
		
		System.out.println(predicateJoin.test("zahih"));
		
		// Function (It will perform some work for us).
		Function<Integer, Integer> doubleIt = x -> x * 2;
		Function<Integer, Integer> tripleIt = z -> z * 3;
		
		System.out.println(doubleIt.andThen(tripleIt).apply(20)); // here first doubleit method will run and then tripleit
		System.out.println(doubleIt.compose(tripleIt).apply(20)); // using the compose method here first the tripleit method will run then the doubleit.
		System.out.println(doubleIt.apply(200));
		
		
		Function<Integer, Integer> identity = Function.identity(); // this method in function just returns the same output whatever input we provide.
		Integer res2 = identity.apply(5);
		System.out.println(res2);
		
		
		// CONSUMER
		Consumer<Integer> print = c -> System.out.println(c);
		print.accept(55);
		
		List<Integer> list = Arrays.asList(4,5,6,7,8);  // this interface will only consume the values.
		Consumer<List<Integer>> printList = x -> {
			
			for(int i : list)
			{
				System.out.println(i);
			}
		};
		printList.accept(list);

		
		//SUPPLIER
			Supplier<String> giveHelloWorld = () -> "Hi there";  // this interface does not takes anything just does the oprations and returns the value.
			System.out.println(giveHelloWorld.get());
			
			
			// combined example of all above interfaces.
			Predicate<Integer> predicate = (h) -> h%2 ==0;
			Function<Integer, Integer> function = c -> c*c; 
			Consumer<Integer> consumer = v -> System.out.println(v);
			Supplier<Integer> supplier = () -> 100;
			
			
			if(predicate.test(supplier.get()))
			{
				consumer.accept(function.apply(supplier.get()));
			}
			
	//Bipredicate, Biconsumer, BiFunction  => these interface takes two input parameters.  
			
			BiPredicate<Integer, Integer> bip = (x,y) -> (x*y) % 2 ==0; 
			System.out.println(bip.test(8, 9));
			
			BiConsumer<Integer, String> bic = (p,q) -> {
				System.out.println(p);
				System.out.println(q);
			};
			
			BiFunction<String, String, Integer> bif = (j,k) -> (j+k).length();
			System.out.println(bif.apply("jhscbjw", "cjhweh"));
			
			
			//Unary Operator and binary
			
			 UnaryOperator<Integer> up = a -> a * 2;
		
			 BinaryOperator<Integer> bo = (b,n) -> (b+n);
			 
			 
			 // Method reference.  -> use method without invoking and in place of lambda expression.
			 
			 List<String> students = Arrays.asList("zoya", "zaheer", "rabiya");
			// students.forEach(x -> System.out.println(x));
			 students.forEach(System.out::println);
			 
			 
			 //Constructor Reference
			 List<String> names = Arrays.asList("A", "B", "C");
			 List<MobilePhones> mobilephones = names.stream().map(MobilePhones::new).collect(Collectors.toList());
	}
}

class MobilePhones
{
	String name;

	public MobilePhones(String name) {
		super();
		this.name = name;
	}
	
}