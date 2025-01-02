package BuilderDesignPattern;

import java.time.LocalDate;

public class EmployeeBuilder {
	
	private int empid;
	private String name;
	private double salary;
	private String address;
	private int yearOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dob;
	
	public EmployeeBuilder()
	{
		super();
	}
	
	public EmployeeBuilder empId(int id)
	{
		this.empid = id;
		return this;
	}
	
	public EmployeeBuilder name(String name)
	{
		this.name = name;
		return this;
	}
	
	public EmployeeBuilder salary(double salary)
	{
		this.salary = salary;
		return this;
	}
	
	public EmployeeBuilder address(String address)
	{
		this.address = address;
		return this;
	}
	
	public EmployeeBuilder yearOfExperience(int yearOfExperience)
	{
		this.yearOfExperience = yearOfExperience;
		return this;
	}
	

	public EmployeeBuilder dateOfJoining(LocalDate dateOfJoining)
	{
		this.dateOfJoining = dateOfJoining;
		return this;
	}
	
	public EmployeeBuilder dob(LocalDate dob)
	{
		this.dob = dob;
		return this;
	}
	
	public Employee build()
	{
		return new Employee(this.empid, this.name, this.salary, this.address, this.yearOfExperience, this.dateOfJoining, this.dob);
	}
	
	public static  EmployeeBuilder builder()
	{
		return new EmployeeBuilder();
	}
}
