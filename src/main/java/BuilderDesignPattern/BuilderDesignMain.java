package BuilderDesignPattern;

import java.time.LocalDate;

public class BuilderDesignMain {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1,"james", 2874893, "bengaluru", 7, LocalDate.of(2004, 6, 28), LocalDate.of(2002, 5, 12));
	
		EmployeeBuilder employee2 = new EmployeeBuilder().empId(007).address("kerela").dob(LocalDate.of(1999, 9, 10)).dateOfJoining(LocalDate.of(2005,3,11));
		
		Employee  employee3 = new EmployeeBuilder().address("dkscbuew").build();
		
		Employee employee4 = EmployeeBuilder.builder().build();
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
	}

}
