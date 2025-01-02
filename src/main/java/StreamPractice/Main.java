package StreamPractice;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	
	public static void main(String[] args) {
		Set<Student> students = new  HashSet();

        students.add(new Student("1", "Alice", "Computer Science", 20, 2, 3.8, 0));
        students.add(new Student("2", "Bob", "Electrical Engineering", 21, 3, 3.6, 1));
        students.add(new Student("3", "Charlie", "Mechanical Engineering", 22, 4, 3.7, 2));
        students.add(new Student("4", "David", "Civil Engineering", 23, 1, 3.9, 0));
        students.add(new Student("5", "Eva", "Mathematics", 19, 2, 3.5, 1));
        students.add(new Student("6", "Frank", "Physics", 20, 3, 3.8, 0));
        students.add(new Student("7", "Grace", "Chemistry", 21, 4, 3.6, 2));
        students.add(new Student("8", "Hank", "Biology", 22, 1, 3.7, 1));
        students.add(new Student("9", "Ivy", "Economics", 23, 2, 3.9, 0));
        students.add(new Student("10", "Jack", "History", 19, 3, 3.5, 2));
        students.add(new Student("11", "Kate", "Philosophy", 20, 4, 3.8, 1));
        students.add(new Student("12", "Leo", "Political Science", 21, 1, 3.6, 0));
        students.add(new Student("13", "Mia", "Sociology", 22, 2, 3.7, 1));
        students.add(new Student("14", "Nina", "Anthropology", 23, 3, 3.9, 0));
        students.add(new Student("15", "Oscar", "Psychology", 19, 4, 3.5, 2));
        students.add(new Student("16", "Paul", "Art", 20, 1, 3.8, 1));
        students.add(new Student("17", "Quincy", "Music", 21, 2, 3.6, 0));
        students.add(new Student("18", "Rachel", "Theater", 22, 3, 3.7, 1));
        students.add(new Student("19", "Sam", "Dance", 23, 4, 3.9, 0));
        students.add(new Student("20", "Tina", "Literature", 19, 1, 3.5, 2));
        
        
//        for (Student student : students) {
//            System.out.println(student);
//        }
        
        //question 1 : Group students by years of enrollment into a Map and calculate the average GPA for each group.

        
        //approach1 : [
        //Map<Integer, Double> averageGpaByYearOfEnrollment = students.stream()
        //.collect(Collectors.groupingBy(stu -> stu.getYearsOfEnrollment(), Collectors.averagingDouble(stu -> stu.getGpa())));
//          averageGpaByYearOfEnrollment.forEach((years, avgGpa) -> 
//          System.out.println("year of enrollment " + years + " " + "averageGPA " + avgGpa));
        
        //]
        
        //approach 2:
        Map<Integer, Double> studentsWithAvgGPAYearEnrollment = students.stream().collect(Collectors.groupingByConcurrent( v -> v.getYearsOfEnrollment(), Collectors.averagingDouble(b -> b.getGpa())));
        studentsWithAvgGPAYearEnrollment.forEach((years, gpa) -> {
        	System.out.println("year Of enrollment " + years + " " + "average GPA " + gpa);
        	
        });
        
          //question 2 : Find the youngest student in each major who has a GPA above 3.5 and return a Map of major to student.

        //approach 1: [
          //Collectors.toMap require 3 arguments.// ask how it will be solved.
//          Map<String, Student> youngestStudentByMajor = students.stream().filter(x -> x.getGpa() > 3.5).collect(Collectors.toMap(stu -> stu.getMajor(), stu -> stu, (existing, replacement) -> existing.getAge() <= replacement.getAge() ? existing : replacement));
//          
//          youngestStudentByMajor.forEach((major, student) ->
//          			
//          System.out.println("Major " + major + " ,Student: " + student.getName())
//        		  );
        //]
        
        
        //approach 2: [  // not correct.
//        Map<String, Student> YoungestInEachMajor = students.stream().
//         filter(d -> d.getGpa() > 3.5).collect(Collectors.groupingBy(q -> q.getMajor(), Collectors.minBy(Comparator.comparingInt(Student::getAge))))
//         .entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
 
        
//        YoungestInEachMajor.forEach((stu, major) -> 
//        	System.out.println("Student name " + stu + " major " + major)
//        		);
        
          
        //question:3  - Count the number of students who have incomplete courses in each major.
          // why is the return type only Long not double or something else?? clarify
         Map<String, Long> studentWithIncompleteCourse = students.stream().filter(d -> d.getNumberOfIncompleteCourses() > 0).collect(Collectors.groupingBy(x -> x.getMajor(), Collectors.counting()));
         
         studentWithIncompleteCourse.forEach((major, stuCount) ->
         System.out.println("major name " + major + " student count " + stuCount)
        		 );
         
         //question4:
         
          List<Student> highest3GpaStudents = students.stream().sorted(Comparator.comparingDouble(Student::getGpa).reversed()).limit(3).collect(Collectors.toList());
          highest3GpaStudents.forEach(x -> System.out.println(x.getName()));
          
          
         
          //question 5 : Partition students into two groups: those with GPAs above 3.5 and those below or equal to 3.5.
          Map<Boolean, List<Student>> partionedStudent = students.stream().collect(Collectors.partitioningBy(x -> x.getGpa() > 3.5));
          
          
          System.out.println("student with gpa above 3.5");
          partionedStudent.get(true).forEach(x -> System.out.println(x.getName()));
          
          
          System.out.println("Student with gpa less than 3.5");
          partionedStudent.get(false).forEach(x -> System.out.println(x.getName()));
          
           
          //Question6: Generate a list of student names in uppercase whose GPA is between 3.5 and 4.0, sorted by name.
          List<String> filteredStudent =  students.stream()
        		 .filter(x -> x.getGpa() > 3.5 && x.getGpa() < 4.0)
        		 .map(stu -> String.format(stu.getName().toUpperCase())).sorted().collect(Collectors.toList());
         
         System.out.println("students with gpa between 3.5 and 4");
         	filteredStudent.forEach(System.out::println); // why is the get name option  not comming.
         	
         
         	//Question7 :Check if all students in the set have GPAs above 3.0 using a stream operation.
         	boolean gpaAbove3 = students.stream().allMatch(stu -> stu.getGpa() > 3.0);
         	 
         	System.out.println("All student above gpa 3.0 " + gpaAbove3);
         	
         	//question 8: Find the first student who has more than 2 incomplete courses and return their name.
         	
         	try {
             	Optional<String> firstStudentWithMoreThanTwoIncompleteCourse = students.stream().filter(x -> x.getNumberOfIncompleteCourses() > 1).map(x -> x.getName()).findFirst();
         		if(firstStudentWithMoreThanTwoIncompleteCourse == null)
         		{
         			System.out.println("No data availbale");
         		}
         		else
         		{
         			System.out.println("first student who has  more than two incomplete course");
         			System.out.println(firstStudentWithMoreThanTwoIncompleteCourse.get());
         	}
         	}
         	  
         		catch(Exception e)
         		{
         			System.out.println("not data available");
         		}

         	
         	//question 9: Calculate the total number of incomplete courses across all students.
         	Double totalNumOfIncompleteCourse = students.stream().mapToDouble(stu -> stu.getNumberOfIncompleteCourses()).sum();
         	System.out.println(totalNumOfIncompleteCourse);
         	
         	//question 10: Group students by their major and calculate the maximum GPA in each major.
         	Map<String, Optional<Student>> studentMajorMaxGpa = students.stream().collect(Collectors.groupingBy(Student::getMajor, Collectors.maxBy(Comparator.comparingDouble(r -> r.getGpa()))));
         		studentMajorMaxGpa.forEach((major, studentOpt) ->
         		studentOpt.ifPresent(stu -> 
         		System.out.println("major is " + major + " and max gpa is " + studentOpt.get().getGpa() + " and Student name is " + studentOpt.get().getName() ))
         				);
         		
         		//question 11: Find the student with the highest GPA in each major and return a Map of major to student.
         		Map<String, Student> studentWithHighestGpaInMajor = students.stream().collect(Collectors.groupingBy(c -> c.getMajor(),  
         				Collectors.maxBy(Comparator.comparingDouble(c -> c.getGpa()))))
         		.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> entry.getValue().orElse(null)));
         		
         		studentWithHighestGpaInMajor.forEach((major, stuOpt) -> 
         		System.out.println("Major is " + major + " -> " + stuOpt.getName())
         				);
         		
   }
}
