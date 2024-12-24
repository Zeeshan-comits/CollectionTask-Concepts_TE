package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream {

	    public static void main(String[] args) {
		
        long startTime = System.currentTimeMillis();
		List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).collect(Collectors.toList());
		List<Long> factorialList = list.stream().map(ParallelStream::factorial).collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken with Stream " + (endTime - startTime) + " ms");
		
		
        startTime = System.currentTimeMillis();
	  //List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).collect(Collectors.toList());
		factorialList = list.parallelStream().map(ParallelStream::factorial).collect(Collectors.toList());
		endTime = System.currentTimeMillis();
		System.out.println("Time taken with ParallelStream " + (endTime - startTime) + " ms");
		
		//Cumulative sum
		// --> [1,2,3,4,5]  --> [1,3,6,10,11].
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		AtomicInteger  sum = new AtomicInteger(0);
		
	}
	    
		private static long factorial(int n)
		{
			
			int fact =1;
			for(int i =n; i>0; i--)
			{
				fact *= 1;
			}
			return fact;
		}
}
