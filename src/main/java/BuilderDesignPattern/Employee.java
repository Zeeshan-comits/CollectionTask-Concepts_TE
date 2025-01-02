package BuilderDesignPattern;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	
	
	private int empid;
	private String name;
	private double salary;
	private String address;
	private int yearOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dob;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int empid, String name, double salary, String address, int yearOfExperience,
			LocalDate dateOfJoining, LocalDate dob) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.yearOfExperience = yearOfExperience;
		this.dateOfJoining = dateOfJoining;
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", yearOfExperience=" + yearOfExperience + ", dateOfJoining=" + dateOfJoining + ", dob=" + dob + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, dateOfJoining, dob, empid, name, salary, yearOfExperience);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && Objects.equals(dateOfJoining, other.dateOfJoining)
				&& Objects.equals(dob, other.dob) && empid == other.empid && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& yearOfExperience == other.yearOfExperience;
	}
	
	

}
