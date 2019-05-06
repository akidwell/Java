package business;

public class Customer extends Person {
	
	private String number;
	public Customer () {
		this.number = "";
		}
	
	public Customer(String firstName, String lastName, String number) {
		super();
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" +
		 "Customer Number: " + number;
	}
	
	
	

}
