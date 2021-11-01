package phoneBookProject;

public class Functions {
	Numbers[] stored = new Numbers[0];

	public void addNewContactRecord(Numbers newNumbers) {
		Numbers temp[] = new Numbers[stored.length + 1];
		for (int i = 0; i < stored.length; i++) {
			temp[i] = stored[i];
		}
		temp[temp.length - 1] = newNumbers;
		stored = temp;
	}

	public void displayAllContactRecords() {
		int k = 0;
		for (int i = 0; i < stored.length; i++) {
			k++;
			System.out.print(k +".)");
			stored[i].printNumber();
		}
	}

	public void searchByFirstName(String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (stored[i].getPerson().getFirstName().toLowerCase().equals(input.toLowerCase())) {
				check = true;
				stored[i].printNumber();
			} else {
			}
		}
		if (!check) {
			System.out.println("Invalid first name");
		}
	}
	
	public void searchByLastName(String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (stored[i].getPerson().getLastName().toLowerCase().equals(input.toLowerCase())) {
				stored[i].printNumber();
				check = true;
			} else {
			}
		}
		if (!check) {
			System.out.println("Invalid last name");
		}
	}

	public void searchByFullName(String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (stored[i].getPerson().getFullName().toLowerCase().equals(input.toLowerCase())) {
				check = true;
				stored[i].printNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid full name");
		}
	}
	
	public void searchByAnyOfContactsPhoneNumbers(String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (!stored[i].getPrimaryPhoneNumber().equals(input)) {
				if (!stored[i].getMobilePhoneNumber().equals(input)) {
					if (stored[i].getFaxNumber().equals(input)) {
						check = true;
						stored[i].printNumber();
					}
				}
				else {
					check = true;
					stored[i].printNumber();
				}
			}
			else {
				check = true;
				stored[i].printNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid phone, mobile or fax number");
		}
	}
	
	public void searchByCity(String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (!stored[i].getPerson().getStreetAddress().toLowerCase().equals(input.toLowerCase())) {
				if(stored[i].getPerson().getCity().toLowerCase().equals(input.toLowerCase())) {
					check = true;
					stored[i].printNumber();
				}
			} else {
				check = true;
				stored[i].printNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid City");
		}
	}
	
	public void searchByState(String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (!stored[i].getPerson().getStreetAddress().toLowerCase().equals(input.toLowerCase())) {
				if(stored[i].getPerson().getState().toLowerCase().equals(input.toLowerCase())) {
					check = true;
					stored[i].printNumber();
				}
			} else {
				check = true;
				stored[i].printNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid State");
		}
	}

// Leaving this method below here for future fix!	
//	
//	public void searchZipcode(String searchValue) {
//		boolean check = false;
//		for (int i = 0; i < stored.length; i++) {
//			if (!stored[i].getPerson().getStreetAddress().toLowerCase().equals(i)/*(input.toLowerCase()*/) {
//				if(stored[i].getPerson().getZipCode())/*.toLowerCase()*//*.equals(i)*//*(input.toLowerCase()*/ {
//					check = true;
//					stored[i].printNumber();
//				}
//			} else {
//				check = true;
//				stored[i].printNumber();
//			}
//		}
//		if (!check) {
//			System.out.println("Invalid search result");
//		}
//		
//	}

	public void searchByEmailAddress(String input) {
		boolean check = false;
		for (int i = 0; i < stored.length; i++) {
			if (!stored[i].getPerson().getStreetAddress().toLowerCase().equals(input.toLowerCase())) {
				if(stored[i].getPerson().getEmailAddress().toLowerCase().equals(input.toLowerCase())) {
					check = true;
					stored[i].printNumber();
				}
			} else {
				check = true;
				stored[i].printNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid email address");
		}
		
	}
	
	public void deleteEntireContactRecordUsingItsPrimaryPhoneNumber(String input) {
		Numbers temp[] = new Numbers[stored.length - 1];
	 int k = 0;
		for (int i = 0; i < stored.length; i++) {
			if (stored[i].getPrimaryPhoneNumber().equals(input)) {
				continue;
			}
			temp[k++] = stored[i];
		}
		stored = temp;
	}
	
	public int updateAContactRecordByUsingAnyOfTheContactsPhoneNumbersToLocateItAndBegin (String input) {
		boolean check = false;
		int index = 0;
		for (int i = 0; i < stored.length; i++) {
			if (stored[i].getPrimaryPhoneNumber().equals(input)) {
				check = true;
				index = i;
				stored[i].printNumber();
			}
			if (stored[i].getMobilePhoneNumber().equals(input)) {
				check = true;
				index = i;
				stored[i].printNumber();
			}
			if (stored[i].getFaxNumber().equals(input)) {
				check = true;
				index = i;
				stored[i].printNumber();
			}
		}
		if (!check) {
			System.out.println("Invalid number");
		}
		return index;
	}
	
	public void sortAndDisplayAllContactRecordsInAscendingOrder() {
		for (int i = 0; i < stored.length; i++) {
			for (int j = i + 1; j < stored.length; j++) {
				if(stored[i].getPerson().getLastName().compareTo(stored[j].getPerson().getLastName()) > 0) {
					Numbers tempNumber = stored[i];
					stored[i] = stored[j];
					stored[j] = tempNumber;
				}

			}

		}

	}
		
}   	