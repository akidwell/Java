
public class Contact {

	// instance variables
	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	// constructors

	public Contact() {
		firstName = ("");
		lastName = ("");
		email = ("");
		phone = ("");

	}

	public Contact(String infirstName, 
					String inlastName, 
					String inemail, String inphone) {
		firstName = infirstName;
		lastName = inlastName;
		email = inemail;
		phone = inphone;
	}
	
	//getters and setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String displayContact() {
		return displayContact();
	
	}
	public String toString() {
		return "Name: " + firstName +" "+ lastName + "\n" + "Phone: " + phone + "\n" + "Email: " + email;
		
				
			}
	
		
	}




	
	
	
	
	



