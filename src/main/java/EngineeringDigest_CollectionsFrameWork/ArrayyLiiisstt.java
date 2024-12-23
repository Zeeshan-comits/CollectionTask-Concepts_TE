package EngineeringDigest_CollectionsFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//class MyComparator implements Comparator<Integer>
//{
//	@Override
//	public int compare(Integer o1, Integer o2)
//	{
//		return o2-o1;   // when we want to sort in descending order. (it will return +ve value).
//						// o1-o2 when we want to sort in ascending order. (it will return -ve value) 
//	} // 5, 3
//}
//
//class StringLengthComparator implements Comparator<String>
//{
//	@Override
//	public int compare(String o1, String o2)
//	{
//		return o1.length() - o2.length();  // sorting in ascending order. ( the method will return -ve value)
//	}	
//}  




class Student
{
	private String name;
	private double gpa;


Student (String name, double gpa)
{
	this.name = name;
	this.gpa = gpa;
}

public String getName()
{
	return name;
}

public double getGpa()
{
	return gpa;
}

}

public class ArrayyLiiisstt {

	public static void main(String[] args) {
		
		List<Student> slist = new ArrayList<>();
		slist.add(new Student("Alice", 3.5));
		slist.add(new Student("Bob", 3.7));
		slist.add(new Student("Charlie", 3.5));
		slist.add(new Student("Akshit", 3.9));
		
		slist.sort((a,b) -> {
			if(b.getGpa() - a.getGpa()> 0 )
			{
				return 1;  // this indicates that b should come before a
			}
			else if(b.getGpa() - a.getGpa() < 0)
			{
				return -1;  // this indicates that a should come before b.
			}
			else {
				return 0; // this means that that if a and b are equal their order remains unchanges.
			}
		});
		
		for(Student s: slist)
		{
			System.out.println(s.getName() + " " + s.getGpa());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<String> words = Arrays.asList("bright", "break", "lit");
		words.sort(/*new StringLengthComparator() */ (a,b) -> b.length() - a.length());
		System.out.println(words);
		
		
		ArrayList<String> al = new ArrayList<>();
		
		System.out.println(al.getClass().getName());
		al.add("mon");
		al.add("tue");
		al.add("wed");
		
		List<String> al2 = Arrays.asList("gold", "diamond", "platinum"); // this list size is fixed we cannot add or remove elements from this list, we can only use setmethod
		al2.set(1, "silver");
		System.out.println(al2.get(1));
		System.out.println(al2.getClass().getName());
		
		List<String> list4 = new ArrayList<>(al2);
		list4.add("perls");
		System.out.println(list4);
		
		String arr1 [] = {"cjsncjn", "ssbcu", "wyurutq"};

		List<String> li2 = Arrays.asList(arr1);
		System.out.println(li2.getClass().getName());
		
//		List<Integer> list3=  List.of(1,2,3,4);
//		list3.set(1, 90);
		
		
		
		
		
		
		
		
//		List<Integer> li = new ArrayList<>();
//		li.add(1);
//		li.add(2);
//		li.add(3);
//		li.add(4);
//		
//		List<Integer> li3 = List.of(90,79,49,96); // why am I not able to use the of().
//		li.addAll(li3);
//		
//		System.out.println(li);
		
		List<Integer> list = new ArrayList();
		list.add(90);
		list.add(2);
		list.add(3);
		
		list.sort(/*new MyComparator()*/ (a,b) -> a - b);
		System.out.println(list);
	
		
//		Integer[] array1 =list.toArray(new Integer[0]); // converting from list to array.
//		Collections.sort(null);
		
//		list.remove(Integer.valueOf(1));
		//System.out.println(list);
		
		
		

			
	}
}