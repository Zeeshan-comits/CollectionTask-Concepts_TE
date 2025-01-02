package Remock2;

public class Student {
	
	   private String name;
	    private String major;
	    private int age;
	    private int yearsOfEnrollment;
	    private double gpa;
	    private int numberOfIncompleteCourses;
	    
	    
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
		@Override
		public String toString() {
			return "Student [name=" + name + ", major=" + major + ", age=" + age + ", yearsOfEnrollment="
					+ yearsOfEnrollment + ", gpa=" + gpa + ", numberOfIncompleteCourses=" + numberOfIncompleteCourses
					+ "]";
		}
		public Student(String name, String major, int age, int yearsOfEnrollment, double gpa,
				int numberOfIncompleteCourses) {
			super();
			this.name = name;
			this.major = major;
			this.age = age;
			this.yearsOfEnrollment = yearsOfEnrollment;
			this.gpa = gpa;
			this.numberOfIncompleteCourses = numberOfIncompleteCourses;
		}
}
