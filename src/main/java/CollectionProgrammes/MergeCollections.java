package CollectionProgrammes;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class MergeCollections {
	 public static void main(String[] args) {
	        // Example lists
	        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
	        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

	        // Using a HashSet to merge the lists and remove duplicates
	        Set<Integer> mergedSet = new HashSet<>();
	        mergedSet.addAll(list1);
	        mergedSet.addAll(list2);

	        // Convert the Set back to a List if you want to keep the result in a List
	        List<Integer> mergedList = new ArrayList<>(mergedSet);

	        System.out.println("Merged List without duplicates: " + mergedList);
	    }
}
