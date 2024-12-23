package hashCodeAndEqualsMethodCheck;

import java.util.Objects;

public class HashCodeAndEqualsMethodCheck {
	
	int id;
	String name;
	int salary;
	
	
	@Override
	public String toString() {
		return "HashCodeAndEqualsMethodCheck [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeAndEqualsMethodCheck other = (HashCodeAndEqualsMethodCheck) obj;
		return id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}
	
//	StringBuffer sb = new StringBuffer();
//	Throwable 
}
