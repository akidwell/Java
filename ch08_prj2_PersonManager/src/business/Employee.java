package business;

public class Employee extends Person{

	private String ssn;
	
	public Employee () {
		this.ssn = ssn;
	}

	public Employee(String firstName, String lastName, String ssn) {
		super();
		this.ssn = ssn;
	}
	


	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" +
		 "SSN: " + ssn;
	}
	
	
}
