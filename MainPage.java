package ronaldBlakeLab6PhoneBookProj.New30Oct2021_03;

import java.util.*;

public class MainPage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Functions cache = new Functions();
		Person p1 = new Person();
		Numbers n1 = new Numbers("6366435698", "6366435697", "6366435696");
		n1.addPerson("John Doe", "114 Market St", "St. Louis", "MO", 63403, "DoeJ@doe1.com");

		cache.addNewContactRecord(n1);

		Numbers n2 = new Numbers("8475390126", "8475390125", "8475390124");
		n2.addPerson("John E Doe", "324 Main St", "St Charles", "MO", 63303, "DoeJE@doe1.com");

		cache.addNewContactRecord(n2);

		Numbers n3 = new Numbers("5628592375", "5628592374", "5628592373");
		n3.addPerson("John Michael West Doe", "574 Pole ave", "St. Peters", "MO", 63333, "DoeJMW@doe1.com");

		cache.addNewContactRecord(n3);
		
		Numbers n4 = new Numbers("6366435695", "6366435694", "6366435693");
		n4.addPerson("Jane Doer", "114 Marketer St", "St. Louise", "KS", 62403, "DoerJ2@doer1.com");

		cache.addNewContactRecord(n4);

		Numbers n5 = new Numbers("8475390123", "8475390122", "8475390121");
		n5.addPerson("Jane E Doer", "324 Mainer St", "St. Charlenes", "KS", 62303, "DoerJE2@doer1.com");

		cache.addNewContactRecord(n5);

		Numbers n6 = new Numbers("5628592372", "5628592371", "5628592370");
		n6.addPerson("Jane Michael West Doer", "574 Polar ave", "St. Peterson", "KS", 62333, "DoerJMW2@doer1.com");

		cache.addNewContactRecord(n6);

		int menuChoice;
	do {
		menuChoice = 0;
		System.out.println("Please choose an option for the program:");
		System.out.println("1- Add a new phonebook contact record");
		System.out.println("2- Search phonebook contact records by the records first name");
		System.out.println("3- Search phonebook contact records by the records last name");
		System.out.println("4- Search phonebook contact records by the records full name");
		System.out.println("5- Search phonebook contact records by any of the records phone numbers");
		System.out.println("6- Search phonebook contact records by the records city");
		System.out.println("7- Search phonebook contact records by the records state");
		//System.out.println("8- Search phonebook contact records by the records zip code"); // This is redundant (Leaving for future fix though)
		System.out.println("8- Search phonebook contact records by the records email address");
		System.out.println("9- Delete an entire phonebook contact record using its primary phone number");
		System.out.println("10- Update a phonebook contact record using any of its phone numbers to locate it and begin");
		System.out.println("11- List all phonebook contact records");
		System.out.println("12- Sort phonebook record entries in Ascending order");
		System.out.println("13- Exit");
		menuChoice = input.nextInt();
		input.nextLine();
		
		switch (menuChoice){
		
		case 1:
			System.out.println("Please enter your Full Name: ");
			String fullName = input.nextLine();

			System.out.println("Please input your Street Address \"Street Number and Name Only\": ");
			String streetAddress = input.nextLine();

			System.out.println("Please enter your City: ");
			String city = input.nextLine();

			System.out.println("Please enter your States 2 Letter Abbreviation: ");
			String state = input.nextLine();

			System.out.println("Please enter your Zipcode: ");
			int zipCode = Integer.parseInt(input.next());
			input.nextLine();
			
			System.out.println("Please enter your Email Address: ");
			String emailAddress = input.nextLine();


			System.out.println("Please enter your 10 digit Primary Phone Number (Numbers Only & No spaces): ");
			String phone = input.next();
			input.nextLine();
			
			System.out.println("Please enter your 10 digit Mobile Phone Number (Numbers Only & No spaces): ");
			String mobile = input.next();
			input.nextLine();
			
			System.out.println("Please enter your 10 digit Fax Number (Numbers Only & No spaces): ");
			String fax = input.next();
			input.nextLine();
			
			Numbers n7 = new Numbers(phone, mobile, fax);
			n7.addPerson(fullName, streetAddress, city, state, zipCode, emailAddress);
			cache.addNewContactRecord(n7);
			pressEnter();
			clearConsole();
			menuChoice = 0;
			break;
			
		case 2:
			System.out.println("Please enter the First Name of the contact you are looking for: ");
			String searchValue = input.next();
			input.nextLine();
			p1.setFullName(searchValue);
			cache.searchByFirstName(searchValue);
			pressEnter();
			clearConsole();
			menuChoice = 0;
			break;
			
		case 3:
			System.out.println("Please enter the Last Name of the contact you are looking for: ");
			searchValue = input.next();
			input.nextLine();
			p1.setFullName(searchValue);
			cache.searchByLastName(searchValue);
			pressEnter();
			clearConsole();
			menuChoice = 0;
			break;
			
		case 4:
			System.out.println("Please enter the Full Name of the contact you are looking for: ");
			searchValue = input.nextLine();
			p1.setFullName(searchValue);
			cache.searchByFullName(searchValue);
			pressEnter();
			clearConsole();
			menuChoice = 0;
			break;
			
		case 5:
			Numbers n10 = new Numbers();
			System.out.println("Please enter one of the Phone numbers (Primary/Mobile/Fax) of the contact you are looking for: ");
			searchValue = input.nextLine();
			n10.setPrimaryPhoneNumber(searchValue);
			n10.setMobilePhoneNumber(searchValue);
			n10.setFaxNumber(searchValue);
			cache.searchByAnyOfContactsPhoneNumbers(searchValue);
			pressEnter();
			clearConsole();
			menuChoice = 0;
			break;
			
		case 6:
			System.out.println("Please enter the City of the contact you are looking for: ");
			searchValue = input.nextLine();
			p1.setStreetAddress(searchValue);
			p1.setCity(searchValue);
			cache.searchByCity(searchValue);
			pressEnter();
			clearConsole();
			menuChoice = 0;
			break;
			
		case 7:
			System.out.println("Please enter the State of the contact you are looking for: ");
			searchValue = input.nextLine();
			p1.setStreetAddress(searchValue);
			p1.setState(searchValue);
			cache.searchByState(searchValue);
			pressEnter();
			clearConsole();
			menuChoice = 0;
			break;
			
			/* This was redundant and was also giving me problems and is not required so I have commented it out!			
			 *		case 8:
			 *			System.out.println("Enter search parameter: Zipcode");
			 *			searchValue = input.nextLine();
			 *			p1.setStreetAddress(searchValue);
			 *			p1.setZipcode(searchValue);
			 *			cache.searchZipcode(searchValue);
			 *			pressEnter();
			 *			clearConsole();
			 *			menuChoice = 0;
			 *			break;
			 *
			 * Note: Leaving here though to fix later for future GitHub upload!
			 */
			
		case 8:
			System.out.println("Please enter the Email Address of the contact you are looking for: ");
			searchValue = input.nextLine();
			p1.setStreetAddress(searchValue);
			p1.setEmailAddress(searchValue);
			cache.searchByEmailAddress(searchValue);
			pressEnter();
			clearConsole();
			menuChoice = 0;
			break;
			
		case 9:
			Numbers n11 = new Numbers();
			System.out.println("Enter a \"primary phone number\" to delete an the associated contact record (Numbers Only): ");
			searchValue = input.nextLine();
			n11.setPrimaryPhoneNumber(searchValue);
			cache.deleteEntireContactRecordUsingItsPrimaryPhoneNumber(searchValue);
			pressEnter();
			clearConsole();
			menuChoice = 0;
			break;
			
		case 10:
			System.out.println("Enter a number to update an entire contact record by one of its Phone Numbers (Numbers Only): ");
			String choice = input.next();
			int index = cache.updateAContactRecordByUsingAnyOfTheContactsPhoneNumbersToLocateItAndBegin(choice);
			input.nextLine();
			
			System.out.println("Please enter your Full Name: ");
			fullName = input.nextLine();
			
			System.out.println("Please input your Street Address \"Street Number and Name Only\": ");
			streetAddress = input.nextLine();
			
			System.out.println("Please enter your City: ");
			city = input.nextLine();
			
			System.out.println("Please enter your State 2 Letter Abbreviation: ");
			state = input.nextLine();
			
			System.out.println("Please enter your Zipcode: ");
			zipCode = Integer.parseInt(input.next());
			input.nextLine();
			
			System.out.println("Please enter your Email Address: ");
			emailAddress = input.nextLine();


			System.out.println("Please enter your 10 digit primary phone number (Numbers Only & No spaces): ");
			phone = input.next();
			input.nextLine();
			
			System.out.println("Please enter your 10 digit mobile phone number (Numbers Only & No spaces): ");
			mobile = input.next();
			input.nextLine();
			
			System.out.println("Please enter your 10 digit fax number (Numbers Only & No spaces): ");
			fax = input.next();
			input.nextLine();
			
			Numbers n12 = new Numbers(fax, mobile, phone);
			n12.addPerson(fullName, streetAddress, city, state, zipCode, emailAddress);
			cache.stored[index] = n12;
			clearConsole();
			cache.displayAllContactRecords();
			menuChoice = 0;
			pressEnter();
			clearConsole();
			
		case 11:
			cache.displayAllContactRecords();
			pressEnter();
			clearConsole();
			menuChoice = 0;
			break;
			
		case 12:
			cache.sortAndDisplayAllContactRecordsInAscendingOrder();
			cache.displayAllContactRecords();
			menuChoice = 0;
			pressEnter();
			clearConsole();
			break;
			
		case 13:
			System.exit(0);
			break;
		}
		
	} while (menuChoice == 0);

		input.close();

	}
	
	public static void clearConsole() {
		System.out.println(System.lineSeparator().repeat(10));
	}
	
	public static void pressEnter() {
		System.out.println("Press enter to continue");
		try {
			System.in.read();
		} catch (Exception e) {}
	}
	}