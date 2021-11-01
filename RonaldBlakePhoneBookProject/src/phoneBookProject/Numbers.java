package phoneBookProject;

public class Numbers {
	private String primaryPhoneNumber;
	private String mobilePhoneNumber;
	private String faxNumber;
	private Person person;

	public Numbers() {

	}

	public Numbers(String primaryPhoneNumber, String mobilePhoneNumber, String faxNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.faxNumber = faxNumber;
	}
	
	public void addPerson(String fullName, String streetAddress, String city, String state, int zipCode, String emailAddress) {
		Person temp = new Person(fullName, streetAddress, city, state, zipCode, emailAddress);
		this.person = temp;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public String getFaxNumber() {
		return faxNumber;
	}
	
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	
	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}
	
	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}
	
	public String getPrimaryPhoneNumber() {
		return primaryPhoneNumber;
	}
	
	public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
		this.primaryPhoneNumber = primaryPhoneNumber;
	}
	
	public void printNumber() {
		person.printPerson();
		java.text.MessageFormat phoneMsgFmt=new java.text.MessageFormat("({0})-{1}-{2}");
		
    String[] phoneNumArr={primaryPhoneNumber.substring(0, 3),
    		primaryPhoneNumber.substring(3,6),
    		primaryPhoneNumber.substring(6)};
    String[] mobileNumArr={mobilePhoneNumber.substring(0, 3),
    		mobilePhoneNumber.substring(3,6),
    		mobilePhoneNumber.substring(6)};
    String[] faxNumArr={faxNumber.substring(0, 3),
    		faxNumber.substring(3,6),
    		faxNumber.substring(6)};

		System.out.println("Primary: "+ phoneMsgFmt.format(phoneNumArr) +"\nMobile: "+ phoneMsgFmt.format(mobileNumArr) +"\nFax: "+ phoneMsgFmt.format(faxNumArr));
		System.out.println("--------------------------------------------------------");
	}
	
} 