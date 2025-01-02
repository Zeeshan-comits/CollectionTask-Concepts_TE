package SingletonPackage;

public class Driver {
	
	public static void main(String[] args) {
		
		Employee emp = Employee.getEmployee(901, "ransom" ,87654);
		Employee emp2 = Employee.getEmployee(902, "romeo", 98007);
		
		// as it is singleton class , even though we create two different object , we will be getting the same output.
		
		System.out.println(emp);
		System.out.println(emp);
		
	}
}
