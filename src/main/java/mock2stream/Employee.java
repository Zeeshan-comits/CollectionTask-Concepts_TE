package mock2stream;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

	   private int employeeId;
	    private String name;
	    private String department;
	    private String jobTitle;
	    private int age;
	    private int yearsOfExperience;
	    private double salary;
	    private int performanceRating;
	private boolean isMarried;
	private LocalDate dateOfJoining;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getPerformanceRating() {
		return performanceRating;
	}
	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", department=" + department + ", jobTitle="
				+ jobTitle + ", age=" + age + ", yearsOfExperience=" + yearsOfExperience + ", salary=" + salary
				+ ", performanceRating=" + performanceRating + ", isMarried=" + isMarried + ", dateOfJoining="
				+ dateOfJoining + "]";
	}
	public Employee(int employeeId, String name, String department, String jobTitle, int age, int yearsOfExperience,
			double salary, int performanceRating, boolean isMarried, LocalDate dateOfJoining) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.jobTitle = jobTitle;
		this.age = age;
		this.yearsOfExperience = yearsOfExperience;
		this.salary = salary;
		this.performanceRating = performanceRating;
		this.isMarried = isMarried;
		this.dateOfJoining = dateOfJoining;
	}
	
	
	
	
}
