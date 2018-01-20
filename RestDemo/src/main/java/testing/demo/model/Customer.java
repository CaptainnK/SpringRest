package testing.demo.model;

public class Customer {
	private String firstName;
	private String lastName;
	
	public Customer() {}
	
	public Customer(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	// firstname
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}
		
	// lastname
	public String getLastname() {
			return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
}
