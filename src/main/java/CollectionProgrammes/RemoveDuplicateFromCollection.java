package CollectionProgrammes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromCollection {

	public static void main(String[] args) {
		
		List <String> list = Arrays.asList("java", "python", "golang", "java", "python");
		
		Set<String> set = new HashSet(list);
		
		System.out.println(set);	
	}
}

