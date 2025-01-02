package mock2stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	  public static void main(String[] args) {
	        List<Employee> employees = Arrays.asList(
	            new Employee(1, "Alice", "Engineering", "Manager", 35, 10, 120000, 9, false, LocalDate.of(2022, 1, 10)),
	            new Employee(2, "Bob", "Marketing", "Manager", 40, 5, 95000, 7, false, LocalDate.of(2020, 5, 15)),
	            new Employee(3, "Charlie", "Engineering", "Developer", 30, 8, 85000, 6, false, LocalDate.of(2015, 3, 20)),
	            new Employee(4, "David", "Sales", "Salesperson", 45, 15, 60000, 8, false, LocalDate.of(2018, 7, 25)),
	            new Employee(5, "Eve", "Marketing", "Manager", 32, 6, 115000, 8, false, LocalDate.of(2019, 10, 1)),
	            new Employee(6, "Frank", "HR", "Recruiter", 29, 4, 75000, 6, false, LocalDate.of(2021, 12, 12)),
	            new Employee(7, "Grace", "Engineering", "Developer", 26, 3, 70000, 7, false, LocalDate.of(2020, 6, 30)),
	            new Employee(8, "Hank", "IT", "Support", 50, 20, 65000, 8, true, LocalDate.of(2005, 9, 14)),
	            new Employee(9, "Ivy", "Finance", "Analyst", 37, 12, 95000, 9, false, LocalDate.of(2016, 11, 4)),
	            new Employee(10, "Jack", "Engineering", "Manager", 48, 22, 130000, 10, false, LocalDate.of(2010, 3, 7)),
	            new Employee(11, "Kate", "IT", "Developer", 27, 3, 80000, 8, false, LocalDate.of(2020, 2, 2)),
	            new Employee(12, "Leo", "Sales", "Salesperson", 34, 9, 50000, 5, true, LocalDate.of(2017, 8, 18)),
	            new Employee(13, "Mia", "Marketing", "Executive", 31, 6, 90000, 7, false, LocalDate.of(2018, 1, 23)),
	            new Employee(14, "Nina", "Engineering", "Developer", 28, 4, 75000, 7, false, LocalDate.of(2019, 4, 19)),
	            new Employee(15, "Oscar", "Finance", "Manager", 43, 15, 110000, 6, false, LocalDate.of(2017, 5, 29)),
	            new Employee(16, "Paul", "HR", "Manager", 39, 14, 120000, 9, false, LocalDate.of(2015, 6, 10)),
	            new Employee(17, "Quincy", "Sales", "Salesperson", 38, 11, 55000, 4, true, LocalDate.of(2019, 9, 15)),
	            new Employee(18, "Rachel", "Marketing", "Analyst", 26, 2, 60000, 6, false, LocalDate.of(2022, 11, 7)),
	            new Employee(19, "Steve", "Engineering", "Developer", 45, 20, 100000, 10, false, LocalDate.of(2004, 12, 30)),
	            new Employee(20, "Tom", "IT", "Support", 29, 5, 65000, 7, true, LocalDate.of(2021, 7, 1))
	        );
	        
	        //Filter out all employees who are managers and have a salary greater than 100,000, but have joined in the last 3 years
	       // employees.stream().filter(e -> e.getJobTitle().equals("Manager") && e.getSalary() > 100000 && Period.between(e.getDateOfJoining(), LocalDateTime.now().ge <= 3))));
	        
	        
		List<String> filteredEmployees = employees.stream().
				filter(e -> e.getJobTitle().equalsIgnoreCase("Manager")
						&& e.getSalary() > 100000 && Period.between(e.getDateOfJoining(), LocalDate.now())
						.getYears() <= 3).sorted(Comparator.comparingInt(Employee::getYearsOfExperience).reversed())
				.sorted(Comparator.comparingInt(Employee::getPerformanceRating))
				.map(c -> c.getName().toUpperCase()).collect(Collectors.toList());
						
	       System.out.println(filteredEmployees);
	        
	       // System.out.println(employees.get(0));
	       
	    
	       
	     
	       //number 4:
	       // Filter, sort, and map to the desired output
//	        List<String> result = employees.stream()
//	            // Filter: Experience less than 3 years, not in IT department, and performance rating >= 8
//	            .filter(e -> e.getYearsOfExperience() >= 3 && !e.getDepartment().equals("IT") && e.getPerformanceRating() >= 8)
//	            // Sort: By performance rating descending, then by years of experience ascending
//	            .sorted(Comparator.comparingInt(Employee::getPerformanceRating).reversed()
//	                    .thenComparingInt(Employee::getYearsOfExperience))
//	            // Map to names suffixed with age
//	            .map(e -> e.getName() + " " + e.getAge())
//	            .collect(Collectors.toList());
//
	       
//	        // Print the result
//	        result.forEach(System.out::println);
	       
	       //number 3:
	       
	       // 1. Remove employees who are part-time (assume part-time means isMarried == true) and have salary < 50,000 in Sales or Marketing
            	       

	       
	     //  number 2:
	    	   
//	    	   List<String> filteredEmployeeIds = employees.stream()
//	            // Filter employees based on the conditions
//	            .filter(emp -> emp.getDateOfJoining().isAfter(fiveYearsAgo))
//	            .filter(emp -> emp.getPerformanceRating() < 8)
//	            .filter(emp -> emp.getSalary() >= 60000 && emp.getSalary() <= 120000)
//	            // Sort by salary in ascending order, then by years of experience in descending order
//	            .sorted(Comparator.comparingDouble(Employee::getSalary)
//	                .thenComparing(Comparator.comparingInt(Employee::getYearsOfExperience).reversed()))
//	            // Collect the IDs of the filtered employees
//	            .map(Employee::getEmployeeId)
//	            .collect(Collectors.toList());
//
//	        // Print the resulting employee IDs
//	        System.out.println(filteredEmployeeIds);
	       
	      // number 1:
	       
	       
	}
}
