// singleton  example.
package SingletonPackage;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	private static Employee employee;
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static Employee getEmployee() {
		return employee;
	}

	public static void setEmployee(Employee employee) {
		Employee.employee = employee;
	}

	private Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	Employee()
	{
		
	}
	
	public static Employee getEmployee(int id, String name, double salary)
	{
		if(employee == null)
		{
			employee = new Employee(102, "Hritik", 98007);
		}
		return employee;

	}	
}
