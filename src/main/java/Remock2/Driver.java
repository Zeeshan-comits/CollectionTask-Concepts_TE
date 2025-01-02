package Remock2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {
	
	public static void reversed(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
	}
	
	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				
                new Student("Alice", "Computer Science", 22, 4, 3.8, 1),
                new Student("Bob", "Electrical Engineering", 21, 1, 3.4, 0),
                new Student("Carol", "Computer Science", 25, 2, 3.6, 0),
                new Student("Dave", "Mechanical Engineering", 23, 1, 3.2, 2),
                new Student("Eve", "Computer Science", 20, 3, 3.9, 0)
                );
		
		 Set<String> outcome = students.stream().filter(x -> x.getYearsOfEnrollment() < 2 && !x.getMajor().equalsIgnoreCase("computer science")
				&& x.getGpa() >= 3.2 && x.getAge() > 20)
		.sorted(Comparator.comparingDouble(Student::getGpa).reversed())
		.sorted(Comparator.comparingInt(Student::getAge)).map(stu -> { 
			String reversedName = new StringBuilder(stu.getName()).reverse().toString().toLowerCase();
			String majorCode = stu.getMajor().chars().filter(Character::isUpperCase).mapToObj(x -> String.valueOf((char) x)).collect(Collectors.joining());
			
			return majorCode + "_" + reversedName + "_" + stu.getAge(); 
		}).collect(Collectors.toCollection(LinkedHashSet::new));
		 
		 outcome.forEach(System.out::println);
	}
}
