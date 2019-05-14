package business;

public class Contact {
	
	private String Name;
	private String email;
	private String phone;
	
	
	public Contact() {
		super();
	}


	public Contact(String name, String email, String phone) {
		super();
		Name = name;
		this.email = email;
		this.phone = phone;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
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


	@Override
	public String toString() {
		return "Contact: Name= " + Name + ", email= " + email + ", phone= " + phone;
	}
	
	
	

}
