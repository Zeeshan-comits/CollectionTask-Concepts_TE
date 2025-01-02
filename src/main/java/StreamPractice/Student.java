package StreamPractice;

import java.util.Objects;

public class Student {
	
	private String id;
    private String name;
    private String major;
    private int age;
    private int yearsOfEnrollment;
    private double gpa;
    private int numberOfIncompleteCourses;
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYearsOfEnrollment() {
		return yearsOfEnrollment;
	}
	public void setYearsOfEnrollment(int yearsOfEnrollment) {
		this.yearsOfEnrollment = yearsOfEnrollment;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getNumberOfIncompleteCourses() {
		return numberOfIncompleteCourses;
	}
	public void setNumberOfIncompleteCourses(int numberOfIncompleteCourses) {
		this.numberOfIncompleteCourses = numberOfIncompleteCourses;
	}
	public Student(String id, String name, String major, int age, int yearsOfEnrollment, double gpa,
			int numberOfIncompleteCourses) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.age = age;
		this.yearsOfEnrollment = yearsOfEnrollment;
		this.gpa = gpa;
		this.numberOfIncompleteCourses = numberOfIncompleteCourses;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, gpa, id, major, name, numberOfIncompleteCourses, yearsOfEnrollment);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa)
				&& Objects.equals(id, other.id) && Objects.equals(major, other.major)
				&& Objects.equals(name, other.name) && numberOfIncompleteCourses == other.numberOfIncompleteCourses
				&& yearsOfEnrollment == other.yearsOfEnrollment;
	}
}
