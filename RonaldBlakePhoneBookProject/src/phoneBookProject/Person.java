package phoneBookProject;

public class Person {
	private String fullName;
	private String streetAddress;
	private String city;
	private String state;
	private int zipCode;
	private String emailAddress;
	
	@SuppressWarnings("unused")
	private String lastName;
	
	@SuppressWarnings("unused")
	private String firstName;

	public Person() {

	}

	public Person( String fullName, String streetAddress, String city, String state, int zipCode, String emailAddress) {
		this.fullName = fullName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.emailAddress = emailAddress;
		
	}
	
	public void printPerson() {

		System.out.println("Owner: "+ fullName +"\nAddress: "+ streetAddress +", "+ city +", "+ state +" "+ zipCode +" "+ emailAddress);
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getFullName(){
		return fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFirstName() {
		String[] arr = fullName.split(" ");
		return firstName = arr[0];
	}

	public String getLastName() {
		String[] arr = fullName.split(" ");
	return lastName = arr[arr.length - 1];
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}